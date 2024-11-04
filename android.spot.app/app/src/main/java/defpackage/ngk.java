package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ngk {
    public final ngd a;
    public final String b;
    public final ngb c;
    public final Map d;
    public nfl e;
    public final msz f;

    public ngk(ngd ngdVar, String str, ngb ngbVar, msz mszVar, Map map) {
        str.getClass();
        map.getClass();
        this.a = ngdVar;
        this.b = str;
        this.c = ngbVar;
        this.f = mszVar;
        this.d = map;
    }

    public final String a(String str) {
        return this.c.b(str);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Request{method=");
        sb.append(this.b);
        sb.append(", url=");
        sb.append(this.a);
        if (this.c.a() != 0) {
            sb.append(", headers=[");
            int i = 0;
            for (Object obj : this.c) {
                int i2 = i + 1;
                if (i < 0) {
                    mkm.S();
                }
                mkw mkwVar = (mkw) obj;
                String str = (String) mkwVar.a;
                String str2 = (String) mkwVar.b;
                if (i > 0) {
                    sb.append(", ");
                }
                sb.append(str);
                sb.append(':');
                sb.append(str2);
                i = i2;
            }
            sb.append(']');
        }
        if (!this.d.isEmpty()) {
            sb.append(", tags=");
            sb.append(this.d);
        }
        sb.append('}');
        return sb.toString();
    }
}
