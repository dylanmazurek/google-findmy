package defpackage;

import android.os.Looper;
import android.view.Choreographer;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bbi extends mpe implements mnw {
    private final /* synthetic */ int v;
    public static final bbi u = new bbi(20);
    public static final bbi t = new bbi(19);
    public static final bbi s = new bbi(18);
    public static final bbi r = new bbi(17);
    public static final bbi q = new bbi(16);
    public static final bbi p = new bbi(15);
    public static final bbi o = new bbi(14);
    public static final bbi n = new bbi(13);
    public static final bbi m = new bbi(12);
    public static final bbi l = new bbi(11);
    public static final bbi k = new bbi(10);
    public static final bbi j = new bbi(9);
    public static final bbi i = new bbi(8);
    public static final bbi h = new bbi(7);
    public static final bbi g = new bbi(6);
    public static final bbi f = new bbi(5);
    public static final bbi e = new bbi(4);
    public static final bbi d = new bbi(3);
    public static final bbi c = new bbi(2);
    public static final bbi b = new bbi(1);
    public static final bbi a = new bbi(0);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bbi(int i2) {
        super(0);
        this.v = i2;
    }

    @Override // defpackage.mnw
    public final /* synthetic */ Object a() {
        Choreographer choreographer;
        int i2 = this.v;
        Float valueOf = Float.valueOf(0.0f);
        switch (i2) {
            case 0:
            case 1:
                return valueOf;
            case 2:
                AndroidCompositionLocals_androidKt.b("LocalConfiguration");
                throw new mks();
            case 3:
                AndroidCompositionLocals_androidKt.b("LocalContext");
                throw new mks();
            case 4:
                AndroidCompositionLocals_androidKt.b("LocalImageVectorCache");
                throw new mks();
            case 5:
                AndroidCompositionLocals_androidKt.b("LocalResourceIdCache");
                throw new mks();
            case 6:
                AndroidCompositionLocals_androidKt.b("LocalSavedStateRegistryOwner");
                throw new mks();
            case 7:
                AndroidCompositionLocals_androidKt.b("LocalView");
                throw new mks();
            case 8:
                if (qz.h()) {
                    choreographer = Choreographer.getInstance();
                } else {
                    mst mstVar = mtj.a;
                    choreographer = (Choreographer) mpp.n(nbc.a, new ccc(null, 1, null));
                }
                bbv bbvVar = new bbv(choreographer, bpw.f(Looper.getMainLooper()));
                return bbvVar.plus(bbvVar.j);
            case 9:
            case 10:
                return null;
            case 11:
                bcg.a("LocalAutofillTree");
                throw new mks();
            case 12:
                bcg.a("LocalClipboardManager");
                throw new mks();
            case 13:
                bcg.a("LocalDensity");
                throw new mks();
            case 14:
                bcg.a("LocalFocusManager");
                throw new mks();
            case 15:
                bcg.a("LocalFontFamilyResolver");
                throw new mks();
            case 16:
                bcg.a("LocalFontLoader");
                throw new mks();
            case 17:
                bcg.a("LocalGraphicsContext");
                throw new mks();
            case 18:
                bcg.a("LocalHapticFeedback");
                throw new mks();
            case 19:
                bcg.a("LocalInputManager");
                throw new mks();
            default:
                bcg.a("LocalLayoutDirection");
                throw new mks();
        }
    }
}
