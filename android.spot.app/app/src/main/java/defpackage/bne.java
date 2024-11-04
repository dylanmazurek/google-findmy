package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public class bne extends bmw {
    public ArrayList aJ = new ArrayList();

    @Override // defpackage.bmw
    public final void V(ksr ksrVar) {
        super.V(ksrVar);
        int size = this.aJ.size();
        for (int i = 0; i < size; i++) {
            ((bmw) this.aJ.get(i)).V(ksrVar);
        }
    }

    public void W() {
        ArrayList arrayList = this.aJ;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                bmw bmwVar = (bmw) this.aJ.get(i);
                if (bmwVar instanceof bne) {
                    ((bne) bmwVar).W();
                }
            }
        }
    }

    public final void ab(bmw bmwVar) {
        this.aJ.remove(bmwVar);
        bmwVar.t();
    }

    @Override // defpackage.bmw
    public void t() {
        this.aJ.clear();
        super.t();
    }
}
