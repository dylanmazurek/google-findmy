package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hcp extends hdj {
    public final hiz a;
    private final hdy x;
    private final cfo y;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public hcp(defpackage.hdy r6) {
        /*
            r5 = this;
            lzt r0 = defpackage.hdk.a()
            java.lang.String r1 = r6.d
            jer r2 = r6.k
            hdf r3 = new hdf
            r3.<init>(r1, r2)
            r0.d = r3
            android.graphics.drawable.Drawable r1 = r6.b
            r2 = 1
            if (r1 != 0) goto L2d
            int r1 = r6.c
            hdo r3 = new hdo
            r4 = 0
            r3.<init>(r4)
            r3.d = r4
            r3.b(r1)
            r1 = 0
            r3.c(r1)
            r3.c(r2)
            hdp r1 = r3.a()
            goto L31
        L2d:
            hdp r1 = defpackage.hdp.c(r1)
        L31:
            r0.y(r1)
            int r1 = r6.a
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            jer r1 = defpackage.jer.i(r1)
            r0.a = r1
            hdh r1 = new hdh
            r1.<init>()
            int r3 = r6.e
            r1.b(r3)
            r3 = 90535(0x161a7, float:1.26867E-40)
            r1.c(r3)
            r1.d(r3)
            hdi r1 = r1.a()
            r0.b = r1
            hdk r0 = r0.x()
            r5.<init>(r0)
            cfk r0 = r6.g
            eqn r1 = new eqn
            r3 = 13
            r1.<init>(r5, r0, r3)
            r5.y = r1
            r5.x = r6
            hiz r0 = new hiz
            r0.<init>()
            boolean r1 = r0.a
            if (r1 == r2) goto L83
            r0.a = r2
            java.lang.Object r1 = r0.b
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            cfn r1 = (defpackage.cfn) r1
            defpackage.hog.R(r1, r2)
        L83:
            r5.a = r0
            android.view.View$OnClickListener r0 = r6.f
            r5.m(r0)
            jer r6 = r6.j
            r5.h = r6
            super.g()
            hdg r6 = defpackage.hdg.CUSTOM_ACTION_CARD
            r5.j(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hcp.<init>(hdy):void");
    }

    @Override // defpackage.hcu
    public final void a(cfc cfcVar) {
        cfk cfkVar = this.x.g;
        if (cfkVar != null) {
            cfkVar.g(cfcVar, this.y);
        }
    }

    @Override // defpackage.hcu
    public final void b(cfc cfcVar, cfo cfoVar) {
        hog.H(new ci(this, cfcVar, cfoVar, 18));
    }

    @Override // defpackage.hcu
    public final void c(cfc cfcVar) {
        hog.H(new gno(this, cfcVar, 11, null));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.hcu
    public final void d() {
        cfk cfkVar = this.x.g;
        if (cfkVar != null) {
            cfkVar.j(this.y);
        }
    }
}
