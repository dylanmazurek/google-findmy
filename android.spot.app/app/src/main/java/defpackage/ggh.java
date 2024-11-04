package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ggh {
    public Long a;
    public Long b;
    public Long c;
    public String d;
    public lia e;
    public String f;
    public Long g;
    public Long h;
    public lhb i;
    private String j;
    private lga k;
    private List l;
    private String m;
    private long n;
    private List o;
    private byte p;
    private int q;
    private int r;
    private int s;
    private int t;
    private int u;

    public ggh() {
    }

    public final ggk a() {
        String str;
        int i;
        int i2;
        int i3;
        int i4;
        Long l;
        Long l2;
        lga lgaVar;
        List list;
        Long l3;
        String str2;
        Long l4;
        Long l5;
        int i5;
        List list2;
        if (this.p == 1 && (str = this.j) != null && (i = this.q) != 0 && (i2 = this.r) != 0 && (i3 = this.s) != 0 && (i4 = this.t) != 0 && (l = this.a) != null && (l2 = this.b) != null && (lgaVar = this.k) != null && (list = this.l) != null && (l3 = this.c) != null && (str2 = this.m) != null && (l4 = this.g) != null && (l5 = this.h) != null && (i5 = this.u) != 0 && (list2 = this.o) != null) {
            return new ggk(str, i, i2, i3, i4, l, l2, lgaVar, list, l3, this.d, this.e, this.f, str2, l4, this.n, l5, i5, this.i, list2);
        }
        StringBuilder sb = new StringBuilder();
        if (this.j == null) {
            sb.append(" id");
        }
        if (this.q == 0) {
            sb.append(" readState");
        }
        if (this.r == 0) {
            sb.append(" deletionStatus");
        }
        if (this.s == 0) {
            sb.append(" countBehavior");
        }
        if (this.t == 0) {
            sb.append(" systemTrayBehavior");
        }
        if (this.a == null) {
            sb.append(" lastUpdatedVersion");
        }
        if (this.b == null) {
            sb.append(" lastNotificationVersion");
        }
        if (this.k == null) {
            sb.append(" androidSdkMessage");
        }
        if (this.l == null) {
            sb.append(" notificationMetadataList");
        }
        if (this.c == null) {
            sb.append(" creationId");
        }
        if (this.m == null) {
            sb.append(" groupId");
        }
        if (this.g == null) {
            sb.append(" expirationTimestampUsec");
        }
        if (this.p == 0) {
            sb.append(" expirationDurationAfterDisplayMs");
        }
        if (this.h == null) {
            sb.append(" insertionTimeMs");
        }
        if (this.u == 0) {
            sb.append(" storageMode");
        }
        if (this.o == null) {
            sb.append(" actionList");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(List list) {
        if (list != null) {
            this.o = list;
            return;
        }
        throw new NullPointerException("Null actionList");
    }

    public final void c(lga lgaVar) {
        if (lgaVar != null) {
            this.k = lgaVar;
            return;
        }
        throw new NullPointerException("Null androidSdkMessage");
    }

    public final void d(long j) {
        this.n = j;
        this.p = (byte) 1;
    }

    public final void e(String str) {
        if (str != null) {
            this.m = str;
            return;
        }
        throw new NullPointerException("Null groupId");
    }

    public final void f(String str) {
        if (str != null) {
            this.j = str;
            return;
        }
        throw new NullPointerException("Null id");
    }

    public final void g(List list) {
        if (list != null) {
            this.l = list;
            return;
        }
        throw new NullPointerException("Null notificationMetadataList");
    }

    public final void h(int i) {
        if (i != 0) {
            this.s = i;
            return;
        }
        throw new NullPointerException("Null countBehavior");
    }

    public final void i(int i) {
        if (i != 0) {
            this.r = i;
            return;
        }
        throw new NullPointerException("Null deletionStatus");
    }

    public final void j(int i) {
        if (i != 0) {
            this.q = i;
            return;
        }
        throw new NullPointerException("Null readState");
    }

    public final void k(int i) {
        if (i != 0) {
            this.u = i;
            return;
        }
        throw new NullPointerException("Null storageMode");
    }

    public final void l(int i) {
        if (i != 0) {
            this.t = i;
            return;
        }
        throw new NullPointerException("Null systemTrayBehavior");
    }

    public ggh(ggk ggkVar) {
        this.j = ggkVar.a;
        this.q = ggkVar.p;
        this.r = ggkVar.q;
        this.s = ggkVar.r;
        this.t = ggkVar.s;
        this.a = ggkVar.b;
        this.b = ggkVar.c;
        this.k = ggkVar.d;
        this.l = ggkVar.e;
        this.c = ggkVar.f;
        this.d = ggkVar.g;
        this.e = ggkVar.h;
        this.f = ggkVar.i;
        this.m = ggkVar.j;
        this.g = ggkVar.k;
        this.n = ggkVar.l;
        this.h = ggkVar.m;
        this.u = ggkVar.t;
        this.i = ggkVar.n;
        this.o = ggkVar.o;
        this.p = (byte) 1;
    }
}
