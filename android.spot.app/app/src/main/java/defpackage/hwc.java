package defpackage;

import android.content.SharedPreferences;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hwc implements hvi {
    public static final Map a = new rx();
    private final SharedPreferences b;
    private final SharedPreferences.OnSharedPreferenceChangeListener c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static synchronized void b() {
        synchronized (hwc.class) {
            Map map = a;
            Iterator it = map.values().iterator();
            if (!it.hasNext()) {
                map.clear();
            } else {
                hwc hwcVar = (hwc) it.next();
                SharedPreferences sharedPreferences = hwcVar.b;
                SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener = hwcVar.c;
                throw null;
            }
        }
    }

    @Override // defpackage.hvi
    public final Object a(String str) {
        throw null;
    }
}
