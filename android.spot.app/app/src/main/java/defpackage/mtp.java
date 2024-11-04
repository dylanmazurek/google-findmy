package defpackage;

import java.util.Objects;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class mtp extends mtr {
    final /* synthetic */ mtt a;
    private final msd c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mtp(mtt mttVar, long j, msd msdVar) {
        super(j);
        this.a = mttVar;
        this.c = msdVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.f(this.a, mlh.a);
    }

    @Override // defpackage.mtr
    public final String toString() {
        String mtrVar = super.toString();
        msd msdVar = this.c;
        Objects.toString(msdVar);
        return mtrVar.concat(msdVar.toString());
    }
}
