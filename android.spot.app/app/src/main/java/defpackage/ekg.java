package defpackage;

import j$.util.function.BiConsumer$CC;
import java.util.function.BiConsumer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class ekg implements BiConsumer {
    public final /* synthetic */ ecr a;
    private final /* synthetic */ int b;

    public /* synthetic */ ekg(ecr ecrVar, int i) {
        this.b = i;
        this.a = ecrVar;
    }

    @Override // java.util.function.BiConsumer
    public final void accept(Object obj, Object obj2) {
        ecq ecqVar;
        boolean z = false;
        if (this.b != 0) {
            dyj dyjVar = (dyj) obj;
            dyi dyiVar = (dyi) obj2;
            ecr ecrVar = this.a;
            if (dyjVar == dyj.LOCATE) {
                int ordinal = dyiVar.ordinal();
                if (ordinal != 0) {
                    if (ordinal != 1) {
                        if (ordinal == 2) {
                            ((efh) ecrVar).aG();
                            return;
                        }
                        return;
                    }
                    ((jni) ((jni) efh.am.g()).j("com/google/android/apps/adm/integrations/android/AndroidDevicePanelFragment", "setActionAvailability", 171, "AndroidDevicePanelFragment.java")).r("Attempt to set locate action availability to DISABLED");
                    return;
                }
                ((efh) ecrVar).aF();
                return;
            }
            if (dyjVar == dyj.RENAME) {
                if (dyiVar == dyi.AVAILABLE) {
                    z = true;
                }
                efh efhVar = (efh) ecrVar;
                if (z != efhVar.ar) {
                    efhVar.ar = z;
                    aj E = efhVar.E();
                    if (E != null) {
                        E.invalidateOptionsMenu();
                        return;
                    }
                    return;
                }
                return;
            }
            ecq ecqVar2 = (ecq) ((efh) ecrVar).ap.get(dyjVar);
            if (ecqVar2 == null) {
                ((jni) ((jni) efh.am.g()).j("com/google/android/apps/adm/integrations/android/AndroidDevicePanelFragment", "setActionAvailability", 190, "AndroidDevicePanelFragment.java")).u("Attempt to change availability of action %s", dyjVar);
                return;
            }
            int ordinal2 = dyiVar.ordinal();
            if (ordinal2 != 0) {
                if (ordinal2 != 1) {
                    if (ordinal2 != 2) {
                        return;
                    }
                    ecqVar2.d = false;
                    return;
                } else {
                    ecqVar2.a();
                    ecqVar2.d = true;
                    return;
                }
            }
            ecqVar2.b();
            ecqVar2.d = true;
            return;
        }
        ejy ejyVar = (ejy) obj;
        eif eifVar = (eif) obj2;
        ecr ecrVar2 = this.a;
        if (ejyVar == ejy.a) {
            int ordinal3 = eifVar.ordinal();
            if (ordinal3 != 0) {
                if (ordinal3 != 1) {
                    if (ordinal3 == 2) {
                        ((ekh) ecrVar2).aG();
                        return;
                    }
                } else {
                    ecrVar2.ak.setVisibility(4);
                    ecrVar2.al.setVisibility(4);
                    return;
                }
            } else {
                ((ekh) ecrVar2).aF();
                return;
            }
        }
        int i = 0;
        while (true) {
            ekh ekhVar = (ekh) ecrVar2;
            jis jisVar = ekhVar.an;
            if (i < ((jmi) jisVar).c) {
                if (((eld) jisVar.get(i)).a == ejyVar) {
                    ecqVar = (ecq) ekhVar.ao.get(i);
                    break;
                }
                i++;
            } else {
                ecqVar = null;
                break;
            }
        }
        if (ecqVar != null) {
            int ordinal4 = eifVar.ordinal();
            if (ordinal4 != 0) {
                if (ordinal4 != 1) {
                    if (ordinal4 != 2) {
                        return;
                    }
                    ecqVar.d = false;
                    return;
                } else {
                    ecqVar.a();
                    ecqVar.d = true;
                    return;
                }
            }
            ecqVar.b();
            ecqVar.d = true;
        }
    }

    public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        if (this.b != 0) {
            return BiConsumer$CC.$default$andThen(this, biConsumer);
        }
        return BiConsumer$CC.$default$andThen(this, biConsumer);
    }
}
