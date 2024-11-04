package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class afm extends mpe implements moh {
    final /* synthetic */ ach a;
    final /* synthetic */ sy b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afm(ach achVar, sy syVar) {
        super(1);
        this.a = achVar;
        this.b = syVar;
    }

    @Override // defpackage.moh
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        this.a.o(obj);
        sy syVar = this.b;
        if (syVar != null) {
            syVar.i(obj);
        }
        return mlh.a;
    }
}
