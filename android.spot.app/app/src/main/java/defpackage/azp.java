package defpackage;

import android.os.Build;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.InputMethodManager;
import java.io.File;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class azp extends mpe implements mnw {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public azp(Object obj, int i) {
        super(0);
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v76, types: [java.lang.Object, cgq] */
    /* JADX WARN: Type inference failed for: r0v8, types: [moh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v90, types: [java.lang.Object, ckg] */
    @Override // defpackage.mnw
    public final /* synthetic */ Object a() {
        int actionMasked;
        cko ckoVar;
        float f = 0.0f;
        boolean z = false;
        int i = 1;
        Object obj = null;
        switch (this.b) {
            case 0:
                azq azqVar = ((azq) this.a).u;
                if (azqVar != null) {
                    azqVar.ab();
                }
                return mlh.a;
            case 1:
                ayz ayzVar = (ayz) this.a;
                ayzVar.a().l(ayzVar.s);
                return mlh.a;
            case 2:
                this.a.a(azq.m);
                ark arkVar = azq.m;
                arm armVar = arkVar.l;
                long j = arkVar.o;
                bln blnVar = arkVar.q;
                ble bleVar = arkVar.p;
                arkVar.r = new ard(iz.f(0L, j));
                return mlh.a;
            case 3:
                MotionEvent motionEvent = ((baw) this.a).w;
                if (motionEvent != null && ((actionMasked = motionEvent.getActionMasked()) == 7 || actionMasked == 9)) {
                    ((baw) this.a).x = SystemClock.uptimeMillis();
                    baw bawVar = (baw) this.a;
                    bawVar.post(bawVar.E);
                }
                return mlh.a;
            case 4:
                return (bfi) ((baw) this.a).s.a();
            case 5:
                bdf bdfVar = (bdf) this.a;
                bfc bfcVar = bdfVar.d;
                bfc bfcVar2 = bdfVar.e;
                Float f2 = bdfVar.b;
                Float f3 = bdfVar.c;
                if (bfcVar == null) {
                    if (bfcVar2 == null) {
                        return mlh.a;
                    }
                    throw null;
                }
                throw null;
            case 6:
                ((mnw) ((mpn) this.a).a).a();
                return mlh.a;
            case 7:
                List list = ((bfx) this.a).c;
                if (!list.isEmpty()) {
                    obj = list.get(0);
                    float a = ((bfz) obj).a.a();
                    int O = mkm.O(list);
                    if (O > 0) {
                        while (true) {
                            Object obj2 = list.get(i);
                            float a2 = ((bfz) obj2).a.a();
                            int compare = Float.compare(a, a2);
                            if (compare < 0) {
                                a = a2;
                            }
                            if (compare < 0) {
                                obj = obj2;
                            }
                            if (i != O) {
                                i++;
                            }
                        }
                    }
                }
                bfz bfzVar = (bfz) obj;
                if (bfzVar != null) {
                    f = bfzVar.a.a();
                }
                return Float.valueOf(f);
            case 8:
                List list2 = ((bfx) this.a).c;
                if (!list2.isEmpty()) {
                    obj = list2.get(0);
                    float b = ((bfz) obj).a.b();
                    int O2 = mkm.O(list2);
                    if (O2 > 0) {
                        while (true) {
                            Object obj3 = list2.get(i);
                            float b2 = ((bfz) obj3).a.b();
                            int compare2 = Float.compare(b, b2);
                            if (compare2 < 0) {
                                b = b2;
                            }
                            if (compare2 < 0) {
                                obj = obj3;
                            }
                            if (i != O2) {
                                i++;
                            }
                        }
                    }
                }
                bfz bfzVar2 = (bfz) obj;
                if (bfzVar2 != null) {
                    f = bfzVar2.a.b();
                }
                return Float.valueOf(f);
            case 9:
                Object systemService = ((bju) this.a).a.getContext().getSystemService("input_method");
                systemService.getClass();
                return (InputMethodManager) systemService;
            case 10:
                return new BaseInputConnection(((bju) this.a).a, false);
            case 11:
                return this.a;
            case 12:
                return ((hpd) this.a).m().c;
            case 13:
                cbp cbpVar = (cbp) ((hpd) this.a).b;
                File canonicalFile = ((File) cbpVar.d.a()).getCanonicalFile();
                synchronized (cbp.b) {
                    String absolutePath = canonicalFile.getAbsolutePath();
                    if (!cbp.a.contains(absolutePath)) {
                        Set set = cbp.a;
                        absolutePath.getClass();
                        set.add(absolutePath);
                    } else {
                        throw new IllegalStateException(a.ag(absolutePath, "There are multiple DataStores active for the same file: ", ". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore's active on the same file (by confirming that the scope is cancelled)."));
                    }
                }
                canonicalFile.getClass();
                return new cbs(canonicalFile, cbpVar.e, (apc) cbpVar.c.a(canonicalFile), new azp(canonicalFile, 14));
            case 14:
                Object obj4 = this.a;
                synchronized (cbp.b) {
                    cbp.a.remove(((File) obj4).getAbsolutePath());
                }
                return mlh.a;
            case 15:
                ((cel) this.a).a = null;
                return mlh.a;
            case 16:
                return cge.b(this.a);
            case 17:
                if (!((cht) this.a).a.q() || ((cht) this.a).a.s()) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 18:
                return new cie(new ddh(((chz) this.a).b.a.a(), (byte[]) null));
            case 19:
                return ((cio) this.a).e();
            default:
                if (Build.VERSION.SDK_INT >= 23) {
                    ckp ckpVar = (ckp) this.a;
                    if (ckpVar.b != null && ckpVar.d) {
                        File noBackupFilesDir = ckpVar.a.getNoBackupFilesDir();
                        noBackupFilesDir.getClass();
                        File file = new File(noBackupFilesDir, ((ckp) this.a).b);
                        Object obj5 = this.a;
                        String absolutePath2 = file.getAbsolutePath();
                        lrs lrsVar = new lrs(null, null);
                        ckp ckpVar2 = (ckp) this.a;
                        ckoVar = new cko(((ckp) obj5).a, absolutePath2, lrsVar, ckpVar2.c, ckpVar2.e);
                        ckoVar.setWriteAheadLoggingEnabled(((ckp) this.a).f);
                        return ckoVar;
                    }
                }
                Object obj6 = this.a;
                lrs lrsVar2 = new lrs(null, null);
                ckp ckpVar3 = (ckp) this.a;
                boolean z2 = ckpVar3.e;
                ckp ckpVar4 = (ckp) obj6;
                ckoVar = new cko(ckpVar4.a, ckpVar4.b, lrsVar2, ckpVar3.c, z2);
                ckoVar.setWriteAheadLoggingEnabled(((ckp) this.a).f);
                return ckoVar;
        }
    }
}
