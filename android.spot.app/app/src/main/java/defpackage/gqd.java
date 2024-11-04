package defpackage;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gqd {
    public Map a;
    public byte[] b;
    public int c;
    private URL d;
    private String e;

    public gqd() {
    }

    public final gqe a() {
        Map map;
        int i;
        URL url = this.d;
        if (url != null && (map = this.a) != null && (i = this.c) != 0) {
            return new gqe(url, this.e, map, this.b, i);
        }
        StringBuilder sb = new StringBuilder();
        if (this.d == null) {
            sb.append(" url");
        }
        if (this.a == null) {
            sb.append(" headers");
        }
        if (this.c == 0) {
            sb.append(" purpose");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final Map b() {
        Map map = this.a;
        if (map != null) {
            return map;
        }
        throw new IllegalStateException("Property \"headers\" has not been set");
    }

    public final void c(gqc gqcVar, String str) {
        List arrayList;
        if (b().containsKey(gqcVar)) {
            arrayList = (List) b().get(gqcVar);
        } else {
            arrayList = new ArrayList(1);
        }
        arrayList.add(str);
        b().put(gqcVar, arrayList);
    }

    public final void d() {
        this.e = "application/x-protobuf";
    }

    public final void e(URL url) {
        if (url != null) {
            this.d = url;
            return;
        }
        throw new NullPointerException("Null url");
    }

    public gqd(gqe gqeVar) {
        this.d = gqeVar.a;
        this.e = gqeVar.b;
        this.a = gqeVar.c;
        this.b = gqeVar.d;
        this.c = gqeVar.e;
    }
}
