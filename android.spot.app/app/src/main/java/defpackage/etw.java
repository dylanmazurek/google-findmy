package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class etw implements jet {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ etw(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.jet
    public final boolean a(Object obj) {
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    int i2 = 5;
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 5) {
                                return ((kzq) obj).b.equals(this.a);
                            }
                            idt idtVar = (idt) this.a;
                            if (idtVar.i >= ((ibj) ((jeu) idtVar.g).a).b) {
                                return false;
                            }
                            return true;
                        }
                        if (((han) this.a).a(obj) == null) {
                            return false;
                        }
                        return true;
                    }
                    return hzc.ab(((han) this.a).p(obj), new eja(i2));
                }
                if (obj == ((hcc) ((ktn) this.a).b).b.a()) {
                    return false;
                }
                return true;
            }
            jnk jnkVar = eku.a;
            kyh b = kyh.b(((kyi) obj).c);
            if (b == null) {
                b = kyh.UNRECOGNIZED;
            }
            if (b != this.a) {
                return false;
            }
            return true;
        }
        return ((kzq) obj).b.equals(((etx) this.a).e);
    }
}
