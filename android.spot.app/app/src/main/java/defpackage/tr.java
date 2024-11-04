package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class tr implements mww {
    final /* synthetic */ aen a;
    final /* synthetic */ wi b;
    final /* synthetic */ agt c;

    public tr(aen aenVar, wi wiVar, agt agtVar) {
        this.a = aenVar;
        this.b = wiVar;
        this.c = agtVar;
    }

    @Override // defpackage.mww
    public final /* bridge */ /* synthetic */ Object dt(Object obj, mmx mmxVar) {
        boolean z;
        if (((Boolean) obj).booleanValue()) {
            mol molVar = (mol) this.c.a();
            wi wiVar = this.b;
            z = ((Boolean) molVar.a(wiVar.d(), wiVar.e())).booleanValue();
        } else {
            z = false;
        }
        this.a.h(Boolean.valueOf(z));
        return mlh.a;
    }
}
