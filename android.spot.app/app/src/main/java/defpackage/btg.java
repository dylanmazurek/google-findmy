package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.UserManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class btg {
    public static boolean a(Context context) {
        Object systemService;
        boolean isUserUnlocked;
        systemService = context.getSystemService((Class<Object>) UserManager.class);
        isUserUnlocked = ((UserManager) systemService).isUserUnlocked();
        return isUserUnlocked;
    }

    public static final cfz b(Bundle bundle, Bundle bundle2) {
        if (bundle == null) {
            if (bundle2 == null) {
                return new cfz();
            }
            HashMap hashMap = new HashMap();
            for (String str : bundle2.keySet()) {
                str.getClass();
                hashMap.put(str, bundle2.get(str));
            }
            return new cfz(hashMap);
        }
        ClassLoader classLoader = cfz.class.getClassLoader();
        classLoader.getClass();
        bundle.setClassLoader(classLoader);
        ArrayList parcelableArrayList = bundle.getParcelableArrayList("keys");
        ArrayList parcelableArrayList2 = bundle.getParcelableArrayList("values");
        if (parcelableArrayList != null && parcelableArrayList2 != null && parcelableArrayList.size() == parcelableArrayList2.size()) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            int size = parcelableArrayList.size();
            for (int i = 0; i < size; i++) {
                Object obj = parcelableArrayList.get(i);
                obj.getClass();
                linkedHashMap.put((String) obj, parcelableArrayList2.get(i));
            }
            return new cfz(linkedHashMap);
        }
        throw new IllegalStateException("Invalid bundle passed as restored state");
    }
}
