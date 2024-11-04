package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class bih extends mnp implements moh {
    int a;
    final /* synthetic */ bij b;
    final /* synthetic */ bio c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bih(bij bijVar, bio bioVar, mmx mmxVar) {
        super(1, mmxVar);
        this.b = bijVar;
        this.c = bioVar;
    }

    @Override // defpackage.moh
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        return new bih(this.b, this.c, (mmx) obj).b(mlh.a);
    }

    @Override // defpackage.mnj
    public final Object b(Object obj) {
        mne mneVar = mne.a;
        int i = this.a;
        mjo.o(obj);
        if (i == 0) {
            bij bijVar = this.b;
            bio bioVar = this.c;
            this.a = 1;
            obj = bijVar.c(bioVar, this);
            if (obj == mneVar) {
                return mneVar;
            }
        }
        return obj;
    }
}
