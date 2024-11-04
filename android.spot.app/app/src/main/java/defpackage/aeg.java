package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aeg implements adk {
    public final ade a = new ade();
    private final adk b;

    public aeg(adk adkVar) {
        this.b = adkVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0088 A[PHI: r8
  0x0088: PHI (r8v9 java.lang.Object) = (r8v8 java.lang.Object), (r8v1 java.lang.Object) binds: [B:17:0x0085, B:10:0x0026] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0087 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.adk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(defpackage.moh r7, defpackage.mmx r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.aef
            if (r0 == 0) goto L13
            r0 = r8
            aef r0 = (defpackage.aef) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            aef r0 = new aef
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.b
            mne r1 = defpackage.mne.a
            int r2 = r0.d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.mjo.o(r8)
            goto L88
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L32:
            java.lang.Object r7 = r0.a
            aeg r2 = r0.e
            defpackage.mjo.o(r8)
            goto L78
        L3a:
            defpackage.mjo.o(r8)
            ade r8 = r6.a
            r0.e = r6
            r0.a = r7
            r0.d = r4
            boolean r2 = r8.a()
            if (r2 == 0) goto L4e
            mlh r8 = defpackage.mlh.a
            goto L75
        L4e:
            mse r2 = new mse
            mmx r5 = defpackage.mjo.w(r0)
            r2.<init>(r5, r4)
            r2.z()
            java.lang.Object r4 = r8.a
            monitor-enter(r4)
            java.util.List r5 = r8.b     // Catch: java.lang.Throwable -> L8a
            r5.add(r2)     // Catch: java.lang.Throwable -> L8a
            monitor-exit(r4)
            add r4 = new add
            r4.<init>(r8, r2)
            r2.d(r4)
            java.lang.Object r8 = r2.j()
            mne r2 = defpackage.mne.a
            if (r8 == r2) goto L75
            mlh r8 = defpackage.mlh.a
        L75:
            if (r8 == r1) goto L89
            r2 = r6
        L78:
            adk r8 = r2.b
            r2 = 0
            r0.e = r2
            r0.a = r2
            r0.d = r3
            java.lang.Object r8 = r8.a(r7, r0)
            if (r8 != r1) goto L88
            return r1
        L88:
            return r8
        L89:
            return r1
        L8a:
            r7 = move-exception
            monitor-exit(r4)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aeg.a(moh, mmx):java.lang.Object");
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
