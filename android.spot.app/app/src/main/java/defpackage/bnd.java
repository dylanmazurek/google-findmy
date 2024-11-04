package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class bnd extends bnb {
    public int aL = 0;
    public int aM = 0;
    public int aN = 0;
    public int aO = 0;
    public int aP = 0;
    public int aQ = 0;
    public boolean aR = false;
    public int aS = 0;
    public int aT = 0;
    protected final bnf aU = new bnf();
    bny aV = null;

    @Override // defpackage.bnb
    public final void Y() {
        for (int i = 0; i < this.aK; i++) {
            bmw bmwVar = this.aJ[i];
            if (bmwVar != null) {
                bmwVar.H = true;
            }
        }
    }

    public final void Z(int i, int i2) {
        this.aS = i;
        this.aT = i2;
    }

    public final void aa(bmw bmwVar, int i, int i2, int i3, int i4) {
        bny bnyVar;
        bmw bmwVar2;
        while (true) {
            bnyVar = this.aV;
            if (bnyVar != null || (bmwVar2 = this.V) == null) {
                break;
            } else {
                this.aV = ((bmx) bmwVar2).aH;
            }
        }
        bnf bnfVar = this.aU;
        bnfVar.i = i;
        bnfVar.j = i3;
        bnfVar.a = i2;
        bnfVar.b = i4;
        bnyVar.a(bmwVar, bnfVar);
        bmwVar.E(this.aU.c);
        bmwVar.z(this.aU.d);
        bnf bnfVar2 = this.aU;
        bmwVar.G = bnfVar2.f;
        bmwVar.w(bnfVar2.e);
    }

    public void W(int i, int i2, int i3, int i4) {
    }
}
