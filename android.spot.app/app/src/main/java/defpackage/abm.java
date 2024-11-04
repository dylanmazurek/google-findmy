package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class abm extends mpe implements mnw {
    final /* synthetic */ abp a;
    final /* synthetic */ agz b;
    final /* synthetic */ afw c;
    final /* synthetic */ ado d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public abm(abp abpVar, agz agzVar, afw afwVar, ado adoVar) {
        super(0);
        this.a = abpVar;
        this.b = agzVar;
        this.c = afwVar;
        this.d = adoVar;
    }

    @Override // defpackage.mnw
    public final /* bridge */ /* synthetic */ Object a() {
        abp abpVar = this.a;
        aha ahaVar = abpVar.w;
        agz agzVar = this.b;
        afw afwVar = this.c;
        ado adoVar = this.d;
        agz agzVar2 = ahaVar.a;
        try {
            ahaVar.a = agzVar;
            afw afwVar2 = abpVar.q;
            int[] iArr = abpVar.g;
            se seVar = abpVar.z;
            abpVar.g = null;
            abpVar.z = null;
            try {
                abpVar.q = afwVar;
                boolean z = ahaVar.d;
                try {
                    ahaVar.d = false;
                    abp.af(abpVar, adoVar.a, adoVar.g, adoVar.b);
                    ahaVar.a = agzVar2;
                    return mlh.a;
                } finally {
                    ahaVar.d = z;
                }
            } finally {
                abpVar.q = afwVar2;
                abpVar.g = iArr;
                abpVar.z = seVar;
            }
        } catch (Throwable th) {
            ahaVar.a = agzVar2;
            throw th;
        }
    }
}
