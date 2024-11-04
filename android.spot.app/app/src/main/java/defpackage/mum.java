package defpackage;

import java.util.ArrayList;
import java.util.Objects;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class mum implements mtz {
    public final mus a;
    private final mrr c;
    public final mro b = new mro(false, mrs.a);
    private final mrr d = new mrr(null, mrs.a);

    public mum(mus musVar, Throwable th) {
        this.a = musVar;
        this.c = new mrr(th, mrs.a);
    }

    @Override // defpackage.mtz
    public final mus a() {
        return this.a;
    }

    public final Object c() {
        return this.d.a;
    }

    public final Throwable d() {
        return (Throwable) this.c.a;
    }

    @Override // defpackage.mtz
    public final boolean dd() {
        if (d() == null) {
            return true;
        }
        return false;
    }

    public final void e(Throwable th) {
        Throwable d = d();
        if (d == null) {
            this.c.c(th);
            return;
        }
        if (th != d) {
            Object c = c();
            if (c == null) {
                f(th);
                return;
            }
            if (c instanceof Throwable) {
                if (th != c) {
                    ArrayList arrayList = new ArrayList(4);
                    arrayList.add(c);
                    arrayList.add(th);
                    f(arrayList);
                    return;
                }
                return;
            }
            if (c instanceof ArrayList) {
                ((ArrayList) c).add(th);
            } else {
                Objects.toString(c);
                throw new IllegalStateException("State is ".concat(c.toString()));
            }
        }
    }

    public final void f(Object obj) {
        this.d.c(obj);
    }

    public final boolean g() {
        if (d() != null) {
            return true;
        }
        return false;
    }

    public final boolean h() {
        return this.b.b();
    }

    public final String toString() {
        return "Finishing[cancelling=" + g() + ", completing=" + h() + ", rootCause=" + d() + ", exceptions=" + c() + ", list=" + this.a + "]";
    }
}
