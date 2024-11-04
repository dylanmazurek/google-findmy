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
public final class ffb extends fez {
    public ffl q;
    private final lkq r;

    public ffb(ffc ffcVar, lkq lkqVar) {
        super(ffcVar);
        this.r = lkqVar;
    }

    @Override // defpackage.fez
    public final /* bridge */ /* synthetic */ fez a() {
        Iterator it = ((ffc) this.a).m.iterator();
        while (it.hasNext()) {
            ((ffa) it.next()).a(this);
        }
        Iterator it2 = ffc.l.iterator();
        while (it2.hasNext()) {
            ((ffa) it2.next()).a(this);
        }
        return this;
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
        ljj ljjVar2 = this.p;
        lim e2 = this.r.e();
        if (!ljjVar2.b.y()) {
            ljjVar2.t();
        }
        lnz lnzVar3 = (lnz) ljjVar2.b;
        lnz lnzVar4 = lnz.k;
        lnzVar3.a |= 2048;
        lnzVar3.e = e2;
        lnz lnzVar5 = (lnz) this.p.q();
        ffc ffcVar = (ffc) this.a;
        PlayLoggerContext playLoggerContext = new PlayLoggerContext(ffcVar.h, fey.a(ffcVar.e), this.j, this.i, ((ffc) this.a).i);
        byte[] g = lnzVar5.g();
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
        return new LogEventParcelable(playLoggerContext, lnzVar5, g, f, strArr, f2, experimentTokensArr, strArr2, lnzVar5.d);
    }

    @Override // defpackage.fez
    public final fhw c() {
        if (!this.b) {
            this.b = true;
            ffd ffdVar = ((ffc) this.a).f;
            return ((ffu) ffdVar).b(this);
        }
        throw new IllegalStateException("do not reuse LogEventBuilder");
    }
}
