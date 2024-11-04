package defpackage;

import j$.util.function.BiConsumer$CC;
import j$.util.stream.Collector;
import java.util.function.BiConsumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jgr {
    public static final Collector a;
    public static final Collector b;

    static {
        final int i = 0;
        final int i2 = 1;
        final int i3 = 2;
        a = Collector.CC.of(new jgn(i), new BiConsumer() { // from class: jgp
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                int i4 = i2;
                if (i4 != 0) {
                    if (i4 != 1) {
                        ((jck) obj).b((jmg) obj2);
                        return;
                    } else {
                        ((jin) obj).h(obj2);
                        return;
                    }
                }
                ((jjp) obj).d(obj2);
            }

            public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                int i4 = i2;
                if (i4 != 0) {
                    if (i4 != 1) {
                        return BiConsumer$CC.$default$andThen(this, biConsumer);
                    }
                    return BiConsumer$CC.$default$andThen(this, biConsumer);
                }
                return BiConsumer$CC.$default$andThen(this, biConsumer);
            }
        }, new jgo(i3), new evl(10), new Collector.Characteristics[0]);
        int i4 = 3;
        b = Collector.CC.of(new jgn(i3), new BiConsumer() { // from class: jgp
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                int i42 = i;
                if (i42 != 0) {
                    if (i42 != 1) {
                        ((jck) obj).b((jmg) obj2);
                        return;
                    } else {
                        ((jin) obj).h(obj2);
                        return;
                    }
                }
                ((jjp) obj).d(obj2);
            }

            public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                int i42 = i;
                if (i42 != 0) {
                    if (i42 != 1) {
                        return BiConsumer$CC.$default$andThen(this, biConsumer);
                    }
                    return BiConsumer$CC.$default$andThen(this, biConsumer);
                }
                return BiConsumer$CC.$default$andThen(this, biConsumer);
            }
        }, new jgo(i4), new evl(11), new Collector.Characteristics[0]);
        Collector.CC.of(new jgn(i4), new BiConsumer() { // from class: jgp
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                int i42 = i3;
                if (i42 != 0) {
                    if (i42 != 1) {
                        ((jck) obj).b((jmg) obj2);
                        return;
                    } else {
                        ((jin) obj).h(obj2);
                        return;
                    }
                }
                ((jjp) obj).d(obj2);
            }

            public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                int i42 = i3;
                if (i42 != 0) {
                    if (i42 != 1) {
                        return BiConsumer$CC.$default$andThen(this, biConsumer);
                    }
                    return BiConsumer$CC.$default$andThen(this, biConsumer);
                }
                return BiConsumer$CC.$default$andThen(this, biConsumer);
            }
        }, new jgo(i), new evl(9), new Collector.Characteristics[0]);
    }

    public static Collector a(final Function function, final Function function2) {
        function.getClass();
        function2.getClass();
        int i = 4;
        return Collector.CC.of(new jgn(i), new BiConsumer() { // from class: jgq
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                Object apply;
                Object apply2;
                Collector collector = jgr.a;
                Function function3 = function2;
                apply = Function.this.apply(obj2);
                apply2 = function3.apply(obj2);
                ((jiu) obj).d(apply, apply2);
            }

            public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                return BiConsumer$CC.$default$andThen(this, biConsumer);
            }
        }, new jgo(i), new evl(12), new Collector.Characteristics[0]);
    }
}
