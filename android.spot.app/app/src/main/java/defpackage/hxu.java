package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hxu {
    public static final /* synthetic */ int a = 0;
    private static final AtomicBoolean b = new AtomicBoolean(false);

    public static void a(final int... iArr) {
        if (b.compareAndSet(false, true)) {
            ffc.j(new ffa() { // from class: hxt
                @Override // defpackage.ffa
                public final void a(ffb ffbVar) {
                    int i = hxu.a;
                    try {
                        ffbVar.e(iArr);
                    } catch (IllegalArgumentException unused) {
                    }
                }
            });
        }
    }
}
