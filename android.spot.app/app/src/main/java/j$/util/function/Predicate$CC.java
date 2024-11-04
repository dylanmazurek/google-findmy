package j$.util.function;

import j$.desugar.sun.nio.fs.h;
import java.util.function.Predicate;

/* renamed from: j$.util.function.Predicate$-CC, reason: invalid class name */
/* loaded from: classes2.dex */
public final /* synthetic */ class Predicate$CC {
    public static Predicate $default$and(Predicate predicate, Predicate predicate2) {
        predicate2.getClass();
        return new d(predicate, predicate2, 0);
    }

    public static Predicate $default$negate(Predicate predicate) {
        return new h(predicate);
    }

    public static Predicate $default$or(Predicate predicate, Predicate predicate2) {
        predicate2.getClass();
        return new d(predicate, predicate2, 1);
    }
}
