//package me.ggulmool.jpatest.domain.support;
//
//import org.springframework.data.domain.Page;
//import org.springframework.data.domain.Pageable;
//import org.springframework.data.jpa.repository.EntityGraph;
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.repository.query.Param;
//
//import java.util.List;
//
//public interface MenuItemRepository extends JpaRepository<MenuItem, String> {
//
////    @EntityGraph(attributePaths = {"childItems", "mid"})
//    @Query("SELECT distinct m from MenuItem m " +
//            "join fetch m.mid " +
//            "join fetch m.childItems c " +
//            "join fetch c.mid " +
//            "where m.parent is null order by m.seq")
//    List<MenuItem> findByParentIsNull();
//
//    @EntityGraph(attributePaths = {"mid", "childItems", "childItems.mid"})
//    @Query("SELECT distinct m from MenuItem m where m.parent is null order by m.seq")
//    List<MenuItem> findByParentIsNull2();
//
//    @Query("SELECT distinct m from MenuItem m where m.parent is null order by m.seq")
//    List<MenuItem> findByParentIsNull3();
//
//    @Query("SELECT new me.ggulmool.jpatest.domain.support.MenuDTO(m.id, m.name) from MenuItem m")
//    List<MenuDTO> findByDto();
//
//    @Query("SELECT distinct m from MenuItem m join fetch m.childItems WHERE m.name=:name")
//    List<MenuItem> findFetchExam(@Param("name") String name);
//
//    MenuItem findByName(String name);
//
//    MenuItem findById(Long id);
//
//    @Query("SELECT m from MenuItem m left join m.parent p WHERE m.id=:id")
//    MenuItem findParent(@Param("id") String id);
//
//    @Query("SELECT c.name from MenuItem m join m.childItems c")
//    List<MenuItem> findSingle();
//
//    @Query("SELECT c.size from MenuItem m join m.childItems c")
//    Long findSingleLength();
//
//    @Query("SELECT CURRENT_DATE, CURRENT_TIME, CURRENT_TIMESTAMP FROM MenuItem m")
//    List<Object[]> currentTime();
//
//    @EntityGraph(attributePaths = {"mid"})
//    @Query("SELECT m FROM MenuItem m WHERE m.id = '4'")
//    List<MenuItem> findMenuItem();
//
//
////    SELECT * FROM MID A
////    WHERE NOT EXISTS (SELECT MID FROM MENU_ITEM B WHERE A.MID=B.MID)
//    @Query("SELECT m FROM Mid m " +
//            "WHERE NOT EXISTS (SELECT c FROM MenuItem c WHERE c.mid = m AND c.id = :id)")
//    List<Mid> findMidNotExists(@Param("id") String id, Pageable pageable);
//
//    @Query("SELECT m FROM Mid m " +
//            "WHERE NOT EXISTS (SELECT c FROM MenuItem c WHERE c.mid = m AND c.id = :id)")
//    Page<Mid> findMidNotExistsPaging(@Param("id") String id, Pageable pageable);
//}
