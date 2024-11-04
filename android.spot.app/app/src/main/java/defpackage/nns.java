package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class nns implements Serializable {
    public static final nns b = new nnr("era", (byte) 1, nnz.a);
    public static final nns c;
    public static final nns d;
    public static final nns e;
    public static final nns f;
    public static final nns g;
    public static final nns h;
    public static final nns i;
    public static final nns j;
    public static final nns k;
    public static final nns l;
    public static final nns m;
    public static final nns n;
    public static final nns o;
    public static final nns p;
    public static final nns q;
    public static final nns r;
    public static final nns s;
    private static final long serialVersionUID = -42615285973990L;
    public static final nns t;
    public static final nns u;
    public static final nns v;
    public static final nns w;
    public static final nns x;
    public final String y;

    static {
        nnz nnzVar = nnz.d;
        c = new nnr("yearOfEra", (byte) 2, nnzVar);
        d = new nnr("centuryOfEra", (byte) 3, nnz.b);
        e = new nnr("yearOfCentury", (byte) 4, nnzVar);
        f = new nnr("year", (byte) 5, nnzVar);
        nnz nnzVar2 = nnz.g;
        g = new nnr("dayOfYear", (byte) 6, nnzVar2);
        h = new nnr("monthOfYear", (byte) 7, nnz.e);
        i = new nnr("dayOfMonth", (byte) 8, nnzVar2);
        nnz nnzVar3 = nnz.c;
        j = new nnr("weekyearOfCentury", (byte) 9, nnzVar3);
        k = new nnr("weekyear", (byte) 10, nnzVar3);
        l = new nnr("weekOfWeekyear", (byte) 11, nnz.f);
        m = new nnr("dayOfWeek", (byte) 12, nnzVar2);
        n = new nnr("halfdayOfDay", (byte) 13, nnz.h);
        nnz nnzVar4 = nnz.i;
        o = new nnr("hourOfHalfday", (byte) 14, nnzVar4);
        p = new nnr("clockhourOfHalfday", (byte) 15, nnzVar4);
        q = new nnr("clockhourOfDay", (byte) 16, nnzVar4);
        r = new nnr("hourOfDay", (byte) 17, nnzVar4);
        nnz nnzVar5 = nnz.j;
        s = new nnr("minuteOfDay", (byte) 18, nnzVar5);
        t = new nnr("minuteOfHour", (byte) 19, nnzVar5);
        nnz nnzVar6 = nnz.k;
        u = new nnr("secondOfDay", (byte) 20, nnzVar6);
        v = new nnr("secondOfMinute", (byte) 21, nnzVar6);
        nnz nnzVar7 = nnz.l;
        w = new nnr("millisOfDay", (byte) 22, nnzVar7);
        x = new nnr("millisOfSecond", (byte) 23, nnzVar7);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public nns(String str) {
        this.y = str;
    }

    public abstract nnq a(nno nnoVar);

    public final String toString() {
        return this.y;
    }
}
