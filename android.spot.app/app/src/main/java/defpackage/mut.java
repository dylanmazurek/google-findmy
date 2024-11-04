package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mut extends mmt implements muf {
    public static final mut a = new mut();

    private mut() {
        super(muf.c);
    }

    @Override // defpackage.muf
    public final muf dp() {
        return null;
    }

    @Override // defpackage.muf
    public final boolean dq() {
        return false;
    }

    @Override // defpackage.muf
    @mkp
    public final Object m(mmx mmxVar) {
        throw new UnsupportedOperationException("This job is always active");
    }

    @Override // defpackage.muf
    @mkp
    public final CancellationException n() {
        throw new IllegalStateException("This job is always active");
    }

    @Override // defpackage.muf
    @mkp
    public final mtl q(boolean z, boolean z2, moh mohVar) {
        return muu.a;
    }

    @Override // defpackage.muf
    public final boolean t() {
        return true;
    }

    public final String toString() {
        return "NonCancellable";
    }

    @Override // defpackage.muf
    @mkp
    public final msi v(mun munVar) {
        return muu.a;
    }

    @Override // defpackage.muf
    @mkp
    public final void dr() {
    }

    @Override // defpackage.muf
    @mkp
    public final void s(CancellationException cancellationException) {
    }

    @Override // defpackage.muf
    @mkp
    public final void w(moh mohVar) {
    }
}
