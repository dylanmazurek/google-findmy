package defpackage;

import android.content.ContentResolver;
import android.database.Cursor;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fyv {
    public final AtomicBoolean a = new AtomicBoolean();
    private HashMap g = null;
    public final HashMap b = new HashMap(16, 1.0f);
    public final HashMap c = new HashMap(16, 1.0f);
    public final HashMap d = new HashMap(16, 1.0f);
    private final HashMap h = new HashMap(16, 1.0f);
    public Object e = null;
    private boolean i = false;
    private final String[] j = new String[0];
    public final fma f = new fma();

    public static final void d(ContentResolver contentResolver) {
        if (contentResolver != null) {
        } else {
            throw new IllegalStateException("ContentResolver needed with GservicesDelegateSupplier.init()");
        }
    }

    public static final Object e(Map map, String str, Object obj) {
        if (map.containsKey(str)) {
            Object obj2 = map.get(str);
            if (obj2 != null) {
                return obj2;
            }
            return obj;
        }
        return null;
    }

    public final String a(ContentResolver contentResolver, String str, String str2) {
        d(contentResolver);
        synchronized (this) {
            b(contentResolver);
            Object obj = this.e;
            if (this.g.containsKey(str)) {
                String str3 = (String) this.g.get(str);
                if (str3 != null) {
                    str2 = str3;
                }
                return str2;
            }
            try {
                Cursor query = contentResolver.query(fyp.a, null, null, new String[]{str}, null);
                String str4 = null;
                try {
                    if (query != null) {
                        if (query.moveToFirst()) {
                            str4 = query.getString(1);
                        }
                        query.close();
                        if (str4 != null && str4.equals(str2)) {
                            str4 = str2;
                        }
                        synchronized (this) {
                            if (obj == this.e) {
                                this.g.put(str, str4);
                            }
                        }
                        if (str4 != null) {
                            return str4;
                        }
                        return str2;
                    }
                    throw new fyu(null);
                } finally {
                }
            } catch (fyu unused) {
                return str2;
            }
        }
    }

    public final void b(ContentResolver contentResolver) {
        if (this.g == null) {
            this.a.set(false);
            this.g = new HashMap(16, 1.0f);
            this.e = new Object();
            contentResolver.registerContentObserver(fyp.a, true, new fys(this));
            return;
        }
        if (this.a.getAndSet(false)) {
            this.g.clear();
            this.b.clear();
            this.c.clear();
            this.d.clear();
            this.h.clear();
            this.e = new Object();
            this.i = false;
        }
    }

    public final void c(Object obj, Map map, String str, Object obj2) {
        if (obj == this.e) {
            map.put(str, obj2);
            this.g.remove(str);
        }
    }
}
