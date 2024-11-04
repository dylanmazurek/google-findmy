package defpackage;

import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.clearcut.LogEventParcelable;
import java.util.ArrayList;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class fez {
    public final fey a;
    public boolean b;
    public jue c;
    public ArrayList d;
    public ArrayList e;
    protected ArrayList f;
    public ArrayList g;
    public Set h;
    public String i;
    public String j;
    public final ffh k;
    public final jyz l;
    public ffh m;
    public boolean n;
    public int o;
    public final ljj p;

    /* JADX INFO: Access modifiers changed from: protected */
    public fez(fey feyVar) {
        ffe ffeVar;
        ffh ffhVar;
        long seconds;
        ljj ljjVar = (ljj) lnz.k.k();
        this.p = ljjVar;
        this.b = false;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
        this.n = false;
        this.a = feyVar;
        this.j = feyVar.g;
        this.i = feyVar.d;
        if (feyVar.e.getApplicationContext() instanceof ffe) {
            ffeVar = (ffe) feyVar.e.getApplicationContext();
        } else {
            ffeVar = (ffe) ffg.a.get();
        }
        if (ffeVar != null) {
            ffhVar = ffeVar.a();
        } else {
            ffhVar = null;
        }
        if (ffhVar == null) {
            this.k = null;
        } else {
            loa loaVar = ffhVar.b;
            if (loaVar != loa.CPS_APP_PROCESS_GLOBAL_PROVIDER && loaVar != loa.NON_CPS_APP_PROCESS_GLOBAL_PROVIDER) {
                Log.e("AbstractLogEventBuilder", "The provided ProductIdOrigin " + loaVar.toString() + " is not one of the process-level expected values: " + String.valueOf(loa.CPS_APP_PROCESS_GLOBAL_PROVIDER) + " or " + String.valueOf(loa.NON_CPS_APP_PROCESS_GLOBAL_PROVIDER));
                this.k = null;
            } else {
                this.k = ffhVar;
            }
        }
        this.l = ffeVar != null ? ffeVar.b() : null;
        long currentTimeMillis = System.currentTimeMillis();
        if (!ljjVar.b.y()) {
            ljjVar.t();
        }
        lnz lnzVar = (lnz) ljjVar.b;
        lnzVar.a |= 1;
        lnzVar.b = currentTimeMillis;
        long j = ((lnz) ljjVar.b).b;
        seconds = TimeUnit.MILLISECONDS.toSeconds(TimeZone.getDefault().getOffset(j));
        if (!ljjVar.b.y()) {
            ljjVar.t();
        }
        lnz lnzVar2 = (lnz) ljjVar.b;
        lnzVar2.a |= 131072;
        lnzVar2.f = seconds;
        if (gad.c(feyVar.e)) {
            if (!ljjVar.b.y()) {
                ljjVar.t();
            }
            lnz lnzVar3 = (lnz) ljjVar.b;
            lnzVar3.a |= 8388608;
            lnzVar3.h = true;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (elapsedRealtime != 0) {
            if (!ljjVar.b.y()) {
                ljjVar.t();
            }
            lnz lnzVar4 = (lnz) ljjVar.b;
            lnzVar4.a |= 2;
            lnzVar4.c = elapsedRealtime;
        }
    }

    public abstract fez a();

    public abstract LogEventParcelable b();

    public abstract fhw c();

    public final void d(ffh ffhVar) {
        lob lobVar = ((lnz) this.p.b).j;
        if (lobVar == null) {
            lobVar = lob.e;
        }
        ljh ljhVar = (ljh) lobVar.z(5);
        ljhVar.w(lobVar);
        loa loaVar = ffhVar.b;
        ljj ljjVar = (ljj) ljhVar;
        if (!ljjVar.b.y()) {
            ljjVar.t();
        }
        lob lobVar2 = (lob) ljjVar.b;
        lobVar2.c = loaVar.l;
        lobVar2.a |= 2;
        lnn lnnVar = lobVar2.b;
        if (lnnVar == null) {
            lnnVar = lnn.c;
        }
        ljh ljhVar2 = (ljh) lnnVar.z(5);
        ljhVar2.w(lnnVar);
        lnm lnmVar = ((lnn) ljhVar2.b).b;
        if (lnmVar == null) {
            lnmVar = lnm.c;
        }
        ljh ljhVar3 = (ljh) lnmVar.z(5);
        ljhVar3.w(lnmVar);
        int i = ffhVar.a;
        if (!ljhVar3.b.y()) {
            ljhVar3.t();
        }
        lnm lnmVar2 = (lnm) ljhVar3.b;
        lnmVar2.a |= 1;
        lnmVar2.b = i;
        if (!ljhVar2.b.y()) {
            ljhVar2.t();
        }
        lnn lnnVar2 = (lnn) ljhVar2.b;
        lnm lnmVar3 = (lnm) ljhVar3.q();
        lnmVar3.getClass();
        lnnVar2.b = lnmVar3;
        lnnVar2.a |= 1;
        ljj ljjVar2 = this.p;
        if (!ljjVar.b.y()) {
            ljjVar.t();
        }
        lob lobVar3 = (lob) ljjVar.b;
        lnn lnnVar3 = (lnn) ljhVar2.q();
        lnnVar3.getClass();
        lobVar3.b = lnnVar3;
        lobVar3.a |= 1;
        lob lobVar4 = (lob) ljjVar.q();
        if (!ljjVar2.b.y()) {
            ljjVar2.t();
        }
        lnz lnzVar = (lnz) ljjVar2.b;
        lobVar4.getClass();
        lnzVar.j = lobVar4;
        lnzVar.a |= 134217728;
    }

    public final void e(int[] iArr) {
        if (!this.a.e()) {
            if (iArr != null && (iArr.length) != 0) {
                if (this.f == null) {
                    this.f = new ArrayList();
                }
                for (int i : iArr) {
                    this.f.add(Integer.valueOf(i));
                }
                return;
            }
            return;
        }
        throw new IllegalArgumentException("addExperimentIds forbidden on deidentified logger");
    }

    public final void f(String str) {
        if (!this.a.e()) {
            if (this.e == null) {
                this.e = new ArrayList();
            }
            this.e.add(str);
            return;
        }
        throw new IllegalArgumentException("addMendelPackage forbidden on deidentified logger");
    }

    public final void g(int i) {
        ljj ljjVar = this.p;
        if (!ljjVar.b.y()) {
            ljjVar.t();
        }
        lnz lnzVar = (lnz) ljjVar.b;
        lnz lnzVar2 = lnz.k;
        lnzVar.a |= 32;
        lnzVar.d = i;
    }

    public final void h(String str) {
        if (this.a.i.a(ffn.ACCOUNT_NAME)) {
            this.i = str;
            return;
        }
        throw new IllegalStateException("setUploadAccountName forbidden on deidentified logger");
    }

    public final String toString() {
        String str;
        String str2;
        String str3;
        StringBuilder sb = new StringBuilder("AbstractLogEventBuilderuploadAccount: ");
        sb.append(this.i);
        sb.append(", logSourceName: ");
        sb.append(this.j);
        sb.append(", qosTier: 0, veMessage: ");
        sb.append(this.c);
        sb.append(", testCodes: ");
        ArrayList arrayList = this.d;
        String str4 = null;
        if (arrayList != null) {
            str = fey.c(arrayList);
        } else {
            str = null;
        }
        sb.append(str);
        sb.append(", mendelPackages: ");
        ArrayList arrayList2 = this.e;
        if (arrayList2 != null) {
            str2 = fey.c(arrayList2);
        } else {
            str2 = null;
        }
        sb.append(str2);
        sb.append(", experimentIds: ");
        ArrayList arrayList3 = this.f;
        if (arrayList3 != null) {
            str3 = fey.c(arrayList3);
        } else {
            str3 = null;
        }
        sb.append(str3);
        sb.append(", experimentTokens: ");
        ArrayList arrayList4 = this.g;
        if (arrayList4 != null) {
            str4 = fey.c(arrayList4);
        }
        sb.append(str4);
        sb.append(", addPhenotype: true]");
        return sb.toString();
    }
}
