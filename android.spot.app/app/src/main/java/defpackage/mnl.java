package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class mnl extends mnj {
    private final mnb a;
    public transient mmx r;

    public mnl(mmx mmxVar) {
        this(mmxVar, mmxVar != null ? mmxVar.o() : null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.mnj
    public void f() {
        mmx mmxVar = this.r;
        if (mmxVar != null && mmxVar != this) {
            mmz mmzVar = o().get(mmy.k);
            mmzVar.getClass();
            ((mmy) mmzVar).d(mmxVar);
        }
        this.r = mnk.a;
    }

    @Override // defpackage.mmx
    public mnb o() {
        mnb mnbVar = this.a;
        mnbVar.getClass();
        return mnbVar;
    }

    public mnl(mmx mmxVar, mnb mnbVar) {
        super(mmxVar);
        this.a = mnbVar;
    }
}
