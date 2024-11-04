package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class dhs extends mpc implements moh {
    private final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dhs(Object obj, int i, byte[] bArr) {
        super(1, obj, baw.class, "registerOnEndApplyChangesListener", "registerOnEndApplyChangesListener(Lkotlin/jvm/functions/Function0;)V", 0);
        this.a = i;
    }

    @Override // defpackage.moh
    public final /* synthetic */ Object a(Object obj) {
        boolean z;
        int i = this.a;
        if (i != 0) {
            if (i != 1) {
                ewq ewqVar = null;
                eeb eebVar = null;
                if (i != 2) {
                    if (i != 3) {
                        ((muc) this.c).b((Throwable) obj);
                        return mlh.a;
                    }
                    edy edyVar = (edy) obj;
                    edv edvVar = (edv) this.c;
                    ewg ewgVar = edvVar.b;
                    jer b = eyf.b(ewgVar.c(), edvVar.c);
                    ljh k = lqc.j.k();
                    k.getClass();
                    lqc lqcVar = (lqc) b.e(hzc.al(k));
                    if (edyVar != null) {
                        if (bsf.n(edvVar.c)) {
                            eebVar = new eea(edyVar.h);
                        } else {
                            eebVar = new edz(edyVar.b, edyVar.c, edyVar.d);
                        }
                    }
                    if (edyVar != null) {
                        z = edyVar.j;
                    } else {
                        z = false;
                    }
                    return new eds(lqcVar, eebVar, z);
                }
                ewo ewoVar = (ewo) obj;
                ewoVar.getClass();
                edl edlVar = (edl) this.c;
                ewq ewqVar2 = edlVar.ap;
                if (ewqVar2 == null) {
                    mpd.b("suggestedActionCard");
                } else {
                    ewqVar = ewqVar2;
                }
                ewqVar.b(edlVar.cv(), ewoVar);
                return mlh.a;
            }
            ((baw) this.c).x((mnw) obj);
            return mlh.a;
        }
        return ((mun) ((dhx) this.c).a).y((mmx) obj);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dhs(Object obj, int i) {
        super(1, obj, dhx.class, "getSize", "getSize(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dhs(Object obj, int i, char[] cArr) {
        super(1, obj, edl.class, "updateSuggestedActionCard", "updateSuggestedActionCard(Lcom/google/android/apps/adm/suggestedaction/SuggestedAction;)V", 0);
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dhs(Object obj, int i, short[] sArr) {
        super(1, obj, edv.class, "buildUiState", "buildUiState(Lcom/google/android/apps/adm/integrations/accessory/AccessoryLocalDeviceState;)Lcom/google/android/apps/adm/integrations/accessory/AccessoryDeviceUiState;", 0);
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dhs(Object obj, int i, int[] iArr) {
        super(1, obj, muc.class, "invoke", "invoke(Ljava/lang/Throwable;)V", 0);
        this.a = i;
    }
}
