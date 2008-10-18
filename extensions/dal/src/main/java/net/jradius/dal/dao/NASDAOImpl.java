package net.jradius.dal.dao;

import com.coova.dal.SqlMapClientWrapper;
import java.util.List;
import net.jradius.dal.model.NAS;
import net.jradius.dal.model.NASExample;

public class NASDAOImpl extends SqlMapClientWrapper implements NASDAO {

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table nas
     *
     * @abatorgenerated Wed Sep 10 13:54:28 CEST 2008
     */
    public NASDAOImpl() {
        super();
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table nas
     *
     * @abatorgenerated Wed Sep 10 13:54:28 CEST 2008
     */
    public Long insert(NAS record) {
        Object newKey = insert("nas", "abatorgenerated_insert", record);
        return (Long) newKey;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table nas
     *
     * @abatorgenerated Wed Sep 10 13:54:28 CEST 2008
     */
    public int updateByPrimaryKey(NAS record) {
        int rows = update("nas", "abatorgenerated_updateByPrimaryKey", record);
        return rows;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table nas
     *
     * @abatorgenerated Wed Sep 10 13:54:28 CEST 2008
     */
    public int updateByPrimaryKeySelective(NAS record) {
        int rows = update("nas", "abatorgenerated_updateByPrimaryKeySelective", record);
        return rows;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table nas
     *
     * @abatorgenerated Wed Sep 10 13:54:28 CEST 2008
     */
    @SuppressWarnings("unchecked")
    public List<NAS> selectByExample(NASExample example) {
        List<NAS> list = (List<NAS>) queryForList("nas", "abatorgenerated_selectByExample", example);
        return list;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table nas
     *
     * @abatorgenerated Wed Sep 10 13:54:28 CEST 2008
     */
    public NAS selectByPrimaryKey(Long id) {
        NAS key = new NAS();
        key.setId(id);
        NAS record = (NAS) queryForObject("nas", "abatorgenerated_selectByPrimaryKey", key);
        return record;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table nas
     *
     * @abatorgenerated Wed Sep 10 13:54:28 CEST 2008
     */
    public int deleteByExample(NASExample example) {
        int rows = delete("nas", "abatorgenerated_deleteByExample", example);
        return rows;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table nas
     *
     * @abatorgenerated Wed Sep 10 13:54:28 CEST 2008
     */
    public int deleteByPrimaryKey(Long id) {
        NAS key = new NAS();
        key.setId(id);
        int rows = delete("nas", "abatorgenerated_deleteByPrimaryKey", key);
        return rows;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table nas
     *
     * @abatorgenerated Wed Sep 10 13:54:28 CEST 2008
     */
    public int countByExample(NASExample example) {
        Integer count = (Integer)  queryForObject("nas", "abatorgenerated_countByExample", example);
        return count;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table nas
     *
     * @abatorgenerated Wed Sep 10 13:54:28 CEST 2008
     */
    public int updateByExampleSelective(NAS record, NASExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = update("nas", "abatorgenerated_updateByExampleSelective", parms);
        return rows;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table nas
     *
     * @abatorgenerated Wed Sep 10 13:54:28 CEST 2008
     */
    public int updateByExample(NAS record, NASExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = update("nas", "abatorgenerated_updateByExample", parms);
        return rows;
    }

    /**
     * This class was generated by Abator for iBATIS.
     * This class corresponds to the database table nas
     *
     * @abatorgenerated Wed Sep 10 13:54:28 CEST 2008
     */
    private static class UpdateByExampleParms extends NASExample {
        private Object record;

        public UpdateByExampleParms(Object record, NASExample example) {
            super(example);
            this.record = record;
        }

        public Object getRecord() {
            return record;
        }
    }
}