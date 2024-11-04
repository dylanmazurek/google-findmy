package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class myu extends mza implements mwv, mzr, mys, mxy {
    private final mrr a;
    private int b;

    public myu(Object obj) {
        this.a = new mrr(obj, mrs.a);
    }

    private final boolean g(Object obj, Object obj2) {
        int i;
        mzc[] mzcVarArr;
        nbj nbjVar;
        synchronized (this) {
            Object obj3 = this.a.a;
            if (obj != null && !amr.i(obj3, obj)) {
                return false;
            }
            if (amr.i(obj3, obj2)) {
                return true;
            }
            this.a.c(obj2);
            int i2 = this.b;
            if ((i2 & 1) == 0) {
                int i3 = i2 + 1;
                this.b = i3;
                mzc[] mzcVarArr2 = this.d;
                while (true) {
                    myw[] mywVarArr = (myw[]) mzcVarArr2;
                    if (mywVarArr != null) {
                        for (myw mywVar : mywVarArr) {
                            if (mywVar != null) {
                                while (true) {
                                    Object obj4 = mywVar.a.get();
                                    if (obj4 != null && obj4 != (nbjVar = myv.b)) {
                                        nbj nbjVar2 = myv.a;
                                        if (obj4 == nbjVar2) {
                                            if (a.o(mywVar.a, obj4, nbjVar)) {
                                                break;
                                            }
                                        } else if (a.o(mywVar.a, obj4, nbjVar2)) {
                                            ((mse) obj4).p(mlh.a);
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    synchronized (this) {
                        i = this.b;
                        if (i == i3) {
                            this.b = i3 + 1;
                            return true;
                        }
                        mzcVarArr = this.d;
                    }
                    mzcVarArr2 = mzcVarArr;
                    i3 = i;
                }
            } else {
                this.b = i2 + 2;
                return true;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0088, code lost:            if (defpackage.amr.i(r13, r14) == false) goto L37;     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00e6, code lost:            if (defpackage.mlh.a != r1) goto L31;     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0079, code lost:            if (r14 == r1) goto L54;     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x007f A[Catch: all -> 0x0038, TryCatch #1 {all -> 0x0038, blocks: (B:13:0x0034, B:14:0x0079, B:16:0x007f, B:18:0x0084, B:20:0x00a4, B:22:0x00b5, B:24:0x00d7, B:25:0x00dc, B:27:0x00e4, B:32:0x008a, B:35:0x0091, B:43:0x004d, B:45:0x0057, B:46:0x006a), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0084 A[Catch: all -> 0x0038, TryCatch #1 {all -> 0x0038, blocks: (B:13:0x0034, B:14:0x0079, B:16:0x007f, B:18:0x0084, B:20:0x00a4, B:22:0x00b5, B:24:0x00d7, B:25:0x00dc, B:27:0x00e4, B:32:0x008a, B:35:0x0091, B:43:0x004d, B:45:0x0057, B:46:0x006a), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00b5 A[Catch: all -> 0x0038, TryCatch #1 {all -> 0x0038, blocks: (B:13:0x0034, B:14:0x0079, B:16:0x007f, B:18:0x0084, B:20:0x00a4, B:22:0x00b5, B:24:0x00d7, B:25:0x00dc, B:27:0x00e4, B:32:0x008a, B:35:0x0091, B:43:0x004d, B:45:0x0057, B:46:0x006a), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /* JADX WARN: Type inference failed for: r13v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v3, types: [muf] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, muf] */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Object, mww] */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x00b3 -> B:14:0x0079). Please report as a decompilation issue!!! */
    @Override // defpackage.mwv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(defpackage.mww r13, defpackage.mmx r14) {
        /*
            Method dump skipped, instructions count: 252
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.myu.a(mww, mmx):java.lang.Object");
    }

    @Override // defpackage.mys
    public final Object c() {
        nbj nbjVar = mzu.a;
        Object obj = this.a.a;
        if (obj == nbjVar) {
            return null;
        }
        return obj;
    }

    @Override // defpackage.mxy
    public final boolean d(Object obj) {
        e(obj);
        return true;
    }

    @Override // defpackage.mzr
    public final mwv ds(mnb mnbVar, int i) {
        return myv.b(this, mnbVar, i);
    }

    @Override // defpackage.mww
    public final Object dt(Object obj, mmx mmxVar) {
        e(obj);
        return mlh.a;
    }

    @Override // defpackage.mxy
    public final void du() {
        throw new UnsupportedOperationException("MutableStateFlow.resetReplayCache is not supported");
    }

    public final void e(Object obj) {
        if (obj == null) {
            obj = mzu.a;
        }
        g(null, obj);
    }

    public final boolean f(Object obj, Object obj2) {
        if (obj == null) {
            obj = mzu.a;
        }
        if (obj2 == null) {
            obj2 = mzu.a;
        }
        return g(obj, obj2);
    }

    @Override // defpackage.mza
    public final /* synthetic */ mzc h() {
        return new myw();
    }

    @Override // defpackage.mza
    public final /* bridge */ /* synthetic */ mzc[] k() {
        return new myw[2];
    }
}
