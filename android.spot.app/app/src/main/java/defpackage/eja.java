package defpackage;

import android.text.TextUtils;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class eja implements jet {
    private final /* synthetic */ int a;

    public /* synthetic */ eja(int i) {
        this.a = i;
    }

    @Override // defpackage.jet
    public final boolean a(Object obj) {
        switch (this.a) {
            case 0:
                jnk jnkVar = ejg.a;
                kym kymVar = ((kzb) obj).b;
                if (kymVar == null) {
                    kymVar = kym.f;
                }
                if (kymVar.b == 10) {
                    return true;
                }
                return false;
            case 1:
                jnk jnkVar2 = ejg.a;
                if (((kzb) obj).d.size() > 0) {
                    return true;
                }
                return false;
            case 2:
                jnk jnkVar3 = ejg.a;
                return ((mcn) obj).a;
            case 3:
                return ((kzq) obj).d;
            case 4:
                kzq kzqVar = (kzq) obj;
                if (!kzqVar.e && !kzqVar.d) {
                    return true;
                }
                return false;
            case 5:
                fpt fptVar = ((hap) obj).b;
                if (fptVar.f && !fptVar.g) {
                    return true;
                }
                return false;
            case 6:
                if (!TextUtils.isEmpty((String) obj)) {
                    return true;
                }
                return false;
            default:
                return ((kzq) obj).e;
        }
    }
}
