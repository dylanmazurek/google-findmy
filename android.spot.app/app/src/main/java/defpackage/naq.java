package defpackage;

import java.lang.reflect.Constructor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class naq extends mpe implements moh {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public naq(Object obj, int i) {
        super(1);
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [moh, java.lang.Object] */
    @Override // defpackage.moh
    public final /* synthetic */ Object a(Object obj) {
        Object obj2;
        int i = this.b;
        Object obj3 = null;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            ((nch) this.a).f();
                            return mlh.a;
                        }
                        boolean z = msy.a;
                        ((ncd) this.a).a.c(null);
                        ((ncd) this.a).d();
                        return mlh.a;
                    }
                    ((ncd) this.a).d();
                    return mlh.a;
                }
                Throwable th = (Throwable) obj;
                try {
                    Throwable th2 = (Throwable) this.a.a(th);
                    boolean i2 = amr.i(th.getMessage(), th2.getMessage());
                    obj2 = th2;
                    if (!i2) {
                        boolean i3 = amr.i(th2.getMessage(), th.toString());
                        obj2 = th2;
                        if (!i3) {
                            obj2 = null;
                        }
                    }
                } catch (Throwable th3) {
                    obj2 = mjo.n(th3);
                }
                if (true != (obj2 instanceof mkx)) {
                    obj3 = obj2;
                }
                return (Throwable) obj3;
            }
            Object newInstance = ((Constructor) this.a).newInstance((Throwable) obj);
            newInstance.getClass();
            return (Throwable) newInstance;
        }
        Object newInstance2 = ((Constructor) this.a).newInstance(null);
        newInstance2.getClass();
        Throwable th4 = (Throwable) newInstance2;
        th4.initCause((Throwable) obj);
        return th4;
    }
}
