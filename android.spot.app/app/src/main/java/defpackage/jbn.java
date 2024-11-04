package defpackage;

import java.util.HashMap;
import java.util.Random;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jbn {
    public static final /* synthetic */ int a = 0;

    static {
        Math.abs(new Random().nextInt());
        new HashMap();
    }

    public static final jei a(jei jeiVar) {
        return new jbl(jbu.b(), jeiVar);
    }

    public static final jxc b(jxc jxcVar) {
        return new jxg(jbu.b(), jxcVar, 1);
    }

    public static final jxd c(jxd jxdVar) {
        return new jxh(jbu.b(), jxdVar, 1);
    }

    public static final jxj d(jxj jxjVar) {
        return new jbj(jbu.b(), jxjVar, 0);
    }

    public static final jyj e(jyj jyjVar) {
        return new jbm(jbu.b(), jyjVar, 0);
    }

    public static final Runnable f(Runnable runnable) {
        return new mcd(new mpn(), jbu.b(), runnable, 1);
    }

    public static final Callable g(Callable callable) {
        return new jxf(jbu.b(), callable, 1);
    }
}
