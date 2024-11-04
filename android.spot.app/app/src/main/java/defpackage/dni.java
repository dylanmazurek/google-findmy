package defpackage;

import android.text.TextUtils;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dni {
    private static final String b;
    private static final Map c;
    private boolean d = true;
    private Map e = c;
    public boolean a = true;

    static {
        String property = System.getProperty("http.agent");
        if (!TextUtils.isEmpty(property)) {
            int length = property.length();
            StringBuilder sb = new StringBuilder(property.length());
            for (int i = 0; i < length; i++) {
                char charAt = property.charAt(i);
                if (charAt <= 31) {
                    if (charAt == '\t') {
                        charAt = '\t';
                    }
                    sb.append('?');
                }
                if (charAt < 127) {
                    sb.append(charAt);
                }
                sb.append('?');
            }
            property = sb.toString();
        }
        b = property;
        HashMap hashMap = new HashMap(2);
        if (!TextUtils.isEmpty(property)) {
            hashMap.put("User-Agent", Collections.singletonList(new dnj(property)));
        }
        c = DesugarCollections.unmodifiableMap(hashMap);
    }

    public final dnk a() {
        this.d = true;
        return new dnk(this.e);
    }

    public final void b() {
        if (this.d) {
            this.d = false;
            HashMap hashMap = new HashMap(this.e.size());
            for (Map.Entry entry : this.e.entrySet()) {
                hashMap.put((String) entry.getKey(), new ArrayList((Collection) entry.getValue()));
            }
            this.e = hashMap;
        }
    }

    public final List c() {
        List list = (List) this.e.get("Authorization");
        if (list == null) {
            ArrayList arrayList = new ArrayList();
            this.e.put("Authorization", arrayList);
            return arrayList;
        }
        return list;
    }
}
