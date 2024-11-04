package defpackage;

import android.animation.TimeInterpolator;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cmk extends cmd {
    private int A;
    ArrayList w;
    int x;
    boolean y;
    private boolean z;

    public cmk(byte[] bArr) {
        this();
        J(1);
        e(new clu(2));
        e(new cls());
        e(new clu(1));
    }

    private final void L(cmd cmdVar) {
        this.w.add(cmdVar);
        cmdVar.h = this;
    }

    @Override // defpackage.cmd
    public final void E() {
        this.A |= 2;
        int size = this.w.size();
        for (int i = 0; i < size; i++) {
            ((cmd) this.w.get(i)).E();
        }
    }

    @Override // defpackage.cmd
    public final /* synthetic */ void F(long j) {
        this.b = j;
    }

    @Override // defpackage.cmd
    public final void G(bzw bzwVar) {
        this.s = null;
        this.A |= 8;
        int size = this.w.size();
        for (int i = 0; i < size; i++) {
            ((cmd) this.w.get(i)).G(null);
        }
    }

    @Override // defpackage.cmd
    public final void H(bzr bzrVar) {
        super.H(bzrVar);
        this.A |= 4;
        if (this.w != null) {
            for (int i = 0; i < this.w.size(); i++) {
                ((cmd) this.w.get(i)).H(bzrVar);
            }
        }
    }

    @Override // defpackage.cmd
    public final void I(ViewGroup viewGroup, eld eldVar, eld eldVar2, ArrayList arrayList, ArrayList arrayList2) {
        long j = this.b;
        int size = this.w.size();
        int i = 0;
        while (i < size) {
            cmd cmdVar = (cmd) this.w.get(i);
            if (j > 0) {
                if (!this.z) {
                    if (i == 0) {
                        i = 0;
                    }
                }
                long j2 = cmdVar.b;
                if (j2 > 0) {
                    cmdVar.F(j2 + j);
                } else {
                    cmdVar.F(j);
                }
            }
            cmdVar.I(viewGroup, eldVar, eldVar2, arrayList, arrayList2);
            i++;
        }
    }

    public final void J(int i) {
        boolean z;
        if (i != 0) {
            z = false;
        } else {
            z = true;
        }
        this.z = z;
    }

    @Override // defpackage.cmd
    /* renamed from: K */
    public final void D(TimeInterpolator timeInterpolator) {
        this.A |= 1;
        ArrayList arrayList = this.w;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((cmd) this.w.get(i)).D(timeInterpolator);
            }
        }
        this.d = timeInterpolator;
    }

    @Override // defpackage.cmd
    public final void b(cmn cmnVar) {
        if (x(cmnVar.b)) {
            ArrayList arrayList = this.w;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                cmd cmdVar = (cmd) arrayList.get(i);
                if (cmdVar.x(cmnVar.b)) {
                    cmdVar.b(cmnVar);
                    cmnVar.c.add(cmdVar);
                }
            }
        }
    }

    @Override // defpackage.cmd
    public final void c(cmn cmnVar) {
        if (x(cmnVar.b)) {
            ArrayList arrayList = this.w;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                cmd cmdVar = (cmd) arrayList.get(i);
                if (cmdVar.x(cmnVar.b)) {
                    cmdVar.c(cmnVar);
                    cmnVar.c.add(cmdVar);
                }
            }
        }
    }

    @Override // defpackage.cmd
    public final /* bridge */ /* synthetic */ Object clone() {
        return clone();
    }

    public final void e(cmd cmdVar) {
        L(cmdVar);
        long j = this.c;
        if (j >= 0) {
            cmdVar.C(j);
        }
        if ((this.A & 1) != 0) {
            cmdVar.D(this.d);
        }
        if ((this.A & 2) != 0) {
            cmdVar.E();
        }
        if ((this.A & 4) != 0) {
            cmdVar.H(this.t);
        }
        if ((this.A & 8) != 0) {
            cmdVar.G(null);
        }
    }

    @Override // defpackage.cmd
    /* renamed from: f */
    public final void C(long j) {
        ArrayList arrayList;
        this.c = j;
        if (this.c >= 0 && (arrayList = this.w) != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((cmd) this.w.get(i)).C(j);
            }
        }
    }

    @Override // defpackage.cmd
    /* renamed from: h */
    public final cmd clone() {
        cmk cmkVar = (cmk) super.clone();
        cmkVar.w = new ArrayList();
        int size = this.w.size();
        for (int i = 0; i < size; i++) {
            cmkVar.L(((cmd) this.w.get(i)).clone());
        }
        return cmkVar;
    }

    @Override // defpackage.cmd
    public final String l(String str) {
        String l = super.l(str);
        for (int i = 0; i < this.w.size(); i++) {
            l = l + "\n" + ((cmd) this.w.get(i)).l(str.concat("  "));
        }
        return l;
    }

    @Override // defpackage.cmd
    public final void m(cmn cmnVar) {
        int size = this.w.size();
        for (int i = 0; i < size; i++) {
            ((cmd) this.w.get(i)).m(cmnVar);
        }
    }

    @Override // defpackage.cmd
    public final void q(ViewGroup viewGroup) {
        super.q(viewGroup);
        int size = this.w.size();
        for (int i = 0; i < size; i++) {
            ((cmd) this.w.get(i)).q(viewGroup);
        }
    }

    @Override // defpackage.cmd
    public final void s(View view) {
        super.s(view);
        int size = this.w.size();
        for (int i = 0; i < size; i++) {
            ((cmd) this.w.get(i)).s(view);
        }
    }

    @Override // defpackage.cmd
    public final void t(View view) {
        super.t(view);
        int size = this.w.size();
        for (int i = 0; i < size; i++) {
            ((cmd) this.w.get(i)).t(view);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cmd
    public final void u() {
        if (!this.w.isEmpty()) {
            cmj cmjVar = new cmj(this);
            ArrayList arrayList = this.w;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((cmd) arrayList.get(i)).y(cmjVar);
            }
            this.x = this.w.size();
            if (!this.z) {
                for (int i2 = 1; i2 < this.w.size(); i2++) {
                    ((cmd) this.w.get(i2 - 1)).y(new cmi((cmd) this.w.get(i2)));
                }
                cmd cmdVar = (cmd) this.w.get(0);
                if (cmdVar != null) {
                    cmdVar.u();
                    return;
                }
                return;
            }
            ArrayList arrayList2 = this.w;
            int size2 = arrayList2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                ((cmd) arrayList2.get(i3)).u();
            }
            return;
        }
        v();
        p();
    }

    public cmk() {
        this.w = new ArrayList();
        this.z = true;
        this.y = false;
        this.A = 0;
    }
}
