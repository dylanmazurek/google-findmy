package defpackage;

import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ikv implements ijv {
    private final lkx a;
    private final lja b;

    private ikv(lkx lkxVar) {
        lja ljaVar = lja.a;
        lkz lkzVar = lkz.a;
        this.b = lja.a;
        this.a = lkxVar;
    }

    public static ikv b(lkq lkqVar) {
        return new ikv(lkqVar.q());
    }

    @Override // defpackage.ijv
    public final /* bridge */ /* synthetic */ Object a(kqr kqrVar) {
        InputStream b = ikt.b(kqrVar);
        try {
            Object h = this.a.h(b, this.b);
            if (b != null) {
                b.close();
            }
            return h;
        } catch (Throwable th) {
            if (b != null) {
                try {
                    b.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }
}
