package com.sortedqueue.viral.data

import com.sortedqueue.viral.data.db.BaseDBHelper
import com.sortedqueue.viral.data.network.BaseApiHelper
import com.sortedqueue.viral.data.preference.BasePreferenceHelper

/**
 * Created by Alok on 02/01/18.
 */
interface BaseDataManager : BaseApiHelper, BaseDBHelper, BasePreferenceHelper {
}