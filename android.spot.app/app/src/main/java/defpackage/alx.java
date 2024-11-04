package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class alx extends mpe implements mnw {
    final /* synthetic */ ama a;
    final /* synthetic */ amh b;
    final /* synthetic */ amc c;
    final /* synthetic */ String d;
    final /* synthetic */ Object e;
    final /* synthetic */ Object[] f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public alx(ama amaVar, amh amhVar, amc amcVar, String str, Object obj, Object[] objArr) {
        super(0);
        this.a = amaVar;
        this.b = amhVar;
        this.c = amcVar;
        this.d = str;
        this.e = obj;
        this.f = objArr;
    }

    @Override // defpackage.mnw
    public final /* bridge */ /* synthetic */ Object a() {
        boolean z;
        ama amaVar = this.a;
        amc amcVar = amaVar.b;
        amc amcVar2 = this.c;
        boolean z2 = true;
        if (amcVar != amcVar2) {
            amaVar.b = amcVar2;
            z = true;
        } else {
            z = false;
        }
        String str = this.d;
        if (!amr.i(amaVar.c, str)) {
            amaVar.c = str;
        } else {
            z2 = z;
        }
        Object[] objArr = this.f;
        Object obj = this.e;
        amaVar.a = this.b;
        amaVar.d = obj;
        amaVar.e = objArr;
        amb ambVar = amaVar.f;
        if (ambVar != null && z2) {
            ambVar.a();
            amaVar.f = null;
            amaVar.d();
        }
        return mlh.a;
    }
}
