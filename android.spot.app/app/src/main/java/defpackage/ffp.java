package defpackage;

import com.google.android.gms.clearcut.LogEventParcelable;
import com.google.android.gms.clearcut.internal.PlayLoggerContext;
import com.google.android.gms.phenotype.ExperimentTokens;
import com.google.ar.core.ImageMetadata;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ffp extends fez {
    public ffp(ffq ffqVar, lim limVar) {
        super(ffqVar);
        ljj ljjVar = this.p;
        if (!ljjVar.b.y()) {
            ljjVar.t();
        }
        lnz lnzVar = (lnz) ljjVar.b;
        lnz lnzVar2 = lnz.k;
        lnzVar.a |= 2048;
        lnzVar.e = limVar;
    }

    @Override // defpackage.fez
    public final /* bridge */ /* synthetic */ fez a() {
        Iterator it = ((ffq) this.a).l.iterator();
        ffp ffpVar = this;
        while (it.hasNext()) {
            ffpVar = ((ffo) it.next()).a();
            if (ffpVar == null) {
                return null;
            }
        }
        return ffpVar;
    }

    @Override // defpackage.fez
    public final LogEventParcelable b() {
        String[] strArr;
        ExperimentTokens[] experimentTokensArr;
        String[] strArr2;
        jue jueVar = this.c;
        if (jueVar != null) {
            ljj ljjVar = this.p;
            lim e = jueVar.e();
            if (!ljjVar.b.y()) {
                ljjVar.t();
            }
            lnz lnzVar = (lnz) ljjVar.b;
            lnz lnzVar2 = lnz.k;
            lnzVar.a |= ImageMetadata.LENS_APERTURE;
            lnzVar.g = e;
        }
        lnz lnzVar3 = (lnz) this.p.q();
        ffq ffqVar = (ffq) this.a;
        PlayLoggerContext playLoggerContext = new PlayLoggerContext(ffqVar.h, fey.a(ffqVar.e), this.j, this.i, ((ffq) this.a).i);
        byte[] g = lnzVar3.g();
        int[] f = fey.f(this.d);
        ArrayList arrayList = this.e;
        if (arrayList != null) {
            strArr = (String[]) arrayList.toArray(fey.b);
        } else {
            strArr = null;
        }
        int[] f2 = fey.f(this.f);
        ArrayList arrayList2 = this.g;
        if (arrayList2 != null) {
            experimentTokensArr = (ExperimentTokens[]) arrayList2.toArray(fey.a);
        } else {
            experimentTokensArr = null;
        }
        Set set = this.h;
        if (set != null) {
            strArr2 = (String[]) set.toArray(fey.b);
        } else {
            strArr2 = null;
        }
        return new LogEventParcelable(playLoggerContext, lnzVar3, g, f, strArr, f2, experimentTokensArr, strArr2, lnzVar3.d);
    }

    @Override // defpackage.fez
    public final fhw c() {
        throw null;
    }
}
