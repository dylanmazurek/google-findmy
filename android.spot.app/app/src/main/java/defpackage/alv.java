package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class alv extends mpe implements moh {
    final /* synthetic */ cfk a;
    final /* synthetic */ cfc b;
    final /* synthetic */ adt c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public alv(cfk cfkVar, cfc cfcVar, adt adtVar) {
        super(1);
        this.a = cfkVar;
        this.b = cfcVar;
        this.c = adtVar;
    }

    @Override // defpackage.moh
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        final adt adtVar = this.c;
        cfo cfoVar = new cfo() { // from class: alt
            @Override // defpackage.cfo
            public final void d(Object obj2) {
                adt.this.h(obj2);
            }
        };
        this.a.g(this.b, cfoVar);
        return new alu(this.a, cfoVar);
    }
}
