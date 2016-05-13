package com.geniusvjr.greendao;

import android.database.sqlite.SQLiteDatabase;

import java.util.Map;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.AbstractDaoSession;
import de.greenrobot.dao.identityscope.IdentityScopeType;
import de.greenrobot.dao.internal.DaoConfig;

import com.geniusvjr.greendao.GreenNews;
import com.geniusvjr.greendao.GreenStat;

import com.geniusvjr.greendao.GreenNewsDao;
import com.geniusvjr.greendao.GreenStatDao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * {@inheritDoc}
 * 
 * @see de.greenrobot.dao.AbstractDaoSession
 */
public class DaoSession extends AbstractDaoSession {

    private final DaoConfig greenNewsDaoConfig;
    private final DaoConfig greenStatDaoConfig;

    private final GreenNewsDao greenNewsDao;
    private final GreenStatDao greenStatDao;

    public DaoSession(SQLiteDatabase db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig>
            daoConfigMap) {
        super(db);

        greenNewsDaoConfig = daoConfigMap.get(GreenNewsDao.class).clone();
        greenNewsDaoConfig.initIdentityScope(type);

        greenStatDaoConfig = daoConfigMap.get(GreenStatDao.class).clone();
        greenStatDaoConfig.initIdentityScope(type);

        greenNewsDao = new GreenNewsDao(greenNewsDaoConfig, this);
        greenStatDao = new GreenStatDao(greenStatDaoConfig, this);

        registerDao(GreenNews.class, greenNewsDao);
        registerDao(GreenStat.class, greenStatDao);
    }
    
    public void clear() {
        greenNewsDaoConfig.getIdentityScope().clear();
        greenStatDaoConfig.getIdentityScope().clear();
    }

    public GreenNewsDao getGreenNewsDao() {
        return greenNewsDao;
    }

    public GreenStatDao getGreenStatDao() {
        return greenStatDao;
    }

}
