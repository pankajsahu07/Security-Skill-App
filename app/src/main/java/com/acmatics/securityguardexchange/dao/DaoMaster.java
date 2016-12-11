package com.acmatics.securityguardexchange.dao;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import de.greenrobot.dao.AbstractDaoMaster;
import de.greenrobot.dao.identityscope.IdentityScopeType;

import com.acmatics.securityguardexchange.dao.QuestionTypeDao;
import com.acmatics.securityguardexchange.dao.QuestionLevelDao;
import com.acmatics.securityguardexchange.dao.QuestionDao;
import com.acmatics.securityguardexchange.dao.AnswerChoiceDao;
import com.acmatics.securityguardexchange.dao.UserTestDao;
import com.acmatics.securityguardexchange.dao.TestQuestionMappingDao;
import com.acmatics.securityguardexchange.dao.TestReportDao;
import com.acmatics.securityguardexchange.dao.QuizTypeDao;
import com.acmatics.securityguardexchange.dao.QuizDao;
import com.acmatics.securityguardexchange.dao.QuizQuestionDao;
import com.acmatics.securityguardexchange.dao.UserQuizReportDao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * Master of DAO (schema version 1): knows all DAOs.
*/
public class DaoMaster extends AbstractDaoMaster {
    public static final int SCHEMA_VERSION = 1;

    /** Creates underlying database table using DAOs. */
    public static void createAllTables(SQLiteDatabase db, boolean ifNotExists) {
        QuestionTypeDao.createTable(db, ifNotExists);
        QuestionLevelDao.createTable(db, ifNotExists);
        QuestionDao.createTable(db, ifNotExists);
        AnswerChoiceDao.createTable(db, ifNotExists);
        UserTestDao.createTable(db, ifNotExists);
        TestQuestionMappingDao.createTable(db, ifNotExists);
        TestReportDao.createTable(db, ifNotExists);
        QuizTypeDao.createTable(db, ifNotExists);
        QuizDao.createTable(db, ifNotExists);
        QuizQuestionDao.createTable(db, ifNotExists);
        UserQuizReportDao.createTable(db, ifNotExists);
    }
    
    /** Drops underlying database table using DAOs. */
    public static void dropAllTables(SQLiteDatabase db, boolean ifExists) {
        QuestionTypeDao.dropTable(db, ifExists);
        QuestionLevelDao.dropTable(db, ifExists);
        QuestionDao.dropTable(db, ifExists);
        AnswerChoiceDao.dropTable(db, ifExists);
        UserTestDao.dropTable(db, ifExists);
        TestQuestionMappingDao.dropTable(db, ifExists);
        TestReportDao.dropTable(db, ifExists);
        QuizTypeDao.dropTable(db, ifExists);
        QuizDao.dropTable(db, ifExists);
        QuizQuestionDao.dropTable(db, ifExists);
        UserQuizReportDao.dropTable(db, ifExists);
    }
    
    public static abstract class OpenHelper extends SQLiteOpenHelper {

        public OpenHelper(Context context, String name, CursorFactory factory) {
            super(context, name, factory, SCHEMA_VERSION);
        }

        @Override
        public void onCreate(SQLiteDatabase db) {
            Log.i("greenDAO", "Creating tables for schema version " + SCHEMA_VERSION);
            createAllTables(db, false);
        }
    }
    
    /** WARNING: Drops all table on Upgrade! Use only during development. */
    public static class DevOpenHelper extends OpenHelper {
        public DevOpenHelper(Context context, String name, CursorFactory factory) {
            super(context, name, factory);
        }

        @Override
        public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
            Log.i("greenDAO", "Upgrading schema from version " + oldVersion + " to " + newVersion + " by dropping all tables");
            dropAllTables(db, true);
            onCreate(db);
        }
    }

    public DaoMaster(SQLiteDatabase db) {
        super(db, SCHEMA_VERSION);
        registerDaoClass(QuestionTypeDao.class);
        registerDaoClass(QuestionLevelDao.class);
        registerDaoClass(QuestionDao.class);
        registerDaoClass(AnswerChoiceDao.class);
        registerDaoClass(UserTestDao.class);
        registerDaoClass(TestQuestionMappingDao.class);
        registerDaoClass(TestReportDao.class);
        registerDaoClass(QuizTypeDao.class);
        registerDaoClass(QuizDao.class);
        registerDaoClass(QuizQuestionDao.class);
        registerDaoClass(UserQuizReportDao.class);
    }
    
    public DaoSession newSession() {
        return new DaoSession(db, IdentityScopeType.Session, daoConfigMap);
    }
    
    public DaoSession newSession(IdentityScopeType type) {
        return new DaoSession(db, type, daoConfigMap);
    }
    
}