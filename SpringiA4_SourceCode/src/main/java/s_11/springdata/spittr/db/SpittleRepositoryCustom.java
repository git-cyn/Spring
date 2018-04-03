package s_11.springdata.spittr.db;

import s_11.springdata.spittr.domain.Spittle;

import java.util.List;



public interface SpittleRepositoryCustom {

  List<Spittle> findRecent();

  List<Spittle> findRecent(int count);

}