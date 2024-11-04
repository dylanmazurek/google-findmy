package defpackage;

import android.view.Choreographer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bbx implements adk {
    public final Choreographer a;
    private final bbv b;

    public bbx(Choreographer choreographer, bbv bbvVar) {
        this.a = choreographer;
        this.b = bbvVar;
    }

    @Override // defpackage.adk
    public final Object a(moh mohVar, mmx mmxVar) {
        mse mseVar = new mse(mjo.w(mmxVar), 1);
        mseVar.z();
        bbw bbwVar = new bbw(mseVar, mohVar);
        bbv bbvVar = this.b;
        if (amr.i(bbvVar.c, this.a)) {
            synchronized (bbvVar.e) {
                bbvVar.f.add(bbwVar);
                if (!bbvVar.h) {
                    bbvVar.h = true;
                    bbvVar.c.postFrameCallback(bbvVar.i);
                }
            }
            mseVar.d(new tn(bbvVar, bbwVar, 14, null));
        } else {
            this.a.postFrameCallback(bbwVar);
            mseVar.d(new tn(this, bbwVar, 15, null));
        }
        return mseVar.j();
    }

    @Override // defpackage.mnb
    public final Object fold(Object obj, mol molVar) {
        return mjo.x(this, obj, molVar);
    }

    @Override // defpackage.mmz, defpackage.mnb
    public final mmz get(mna mnaVar) {
        return mjo.y(this, mnaVar);
    }

    @Override // defpackage.mmz
    public final /* synthetic */ mna getKey() {
        return adk.e;
    }

    @Override // defpackage.mnb
    public final mnb minusKey(mna mnaVar) {
        return mjo.z(this, mnaVar);
    }

    @Override // defpackage.mnb
    public final mnb plus(mnb mnbVar) {
        return mjo.A(this, mnbVar);
    }
}
