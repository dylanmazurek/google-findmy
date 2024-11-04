package defpackage;

import kotlinx.coroutines.CoroutineExceptionHandler;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class biu {
    private static final CoroutineExceptionHandler c = new bit(CoroutineExceptionHandler.a);
    public msw a;
    public final eld b;

    public biu() {
        this(null, 3);
    }

    public /* synthetic */ biu(eld eldVar, int i) {
        eldVar = (i & 1) != 0 ? new eld((byte[]) null, (byte[]) null, (byte[]) null) : eldVar;
        mnc mncVar = mnc.a;
        this.b = eldVar;
        mnb plus = c.plus(bkg.a).plus(mncVar);
        mncVar.get(muf.c);
        this.a = msz.m(plus.plus(new mva(null)));
    }
}
