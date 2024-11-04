package defpackage;

import android.app.NotificationManager;
import android.app.admin.DevicePolicyManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.os.UserManager;
import android.service.notification.StatusBarNotification;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Base64;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.widget.TextView;
import com.google.android.apps.adm.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public class frx {
    public static fsd b;
    public static frq c;

    public frx() {
    }

    public static String A(jjr jjrVar) {
        StringBuilder sb = new StringBuilder();
        jis d = jjrVar.d();
        for (int i = 0; i < d.size(); i++) {
            sb.append(((gwo) d.get(i)).c);
            if (i < jjrVar.size() - 1) {
                sb.append(",");
            }
        }
        return sb.toString();
    }

    public static int B(int i) {
        int[] E = E();
        for (int i2 = 0; i2 < 4; i2++) {
            int i3 = E[i2];
            if (i3 != 0) {
                if (i3 == i) {
                    return i3;
                }
            } else {
                throw null;
            }
        }
        throw new IllegalArgumentException(String.format("Account type %d is not supported.", Integer.valueOf(i)));
    }

    public static /* synthetic */ String C(int i) {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        return "null";
                    }
                    return "DELEGATED_GAIA";
                }
                return "YOUTUBE_VISITOR";
            }
            return "ZWIEBACK";
        }
        return "GAIA";
    }

    public static int D(gwf gwfVar) {
        gwfVar.getClass();
        if (gwfVar instanceof gwh) {
            return 1;
        }
        if (gwfVar instanceof gws) {
            return 2;
        }
        if (gwfVar instanceof gwq) {
            return 3;
        }
        if (gwfVar instanceof gwg) {
            return 4;
        }
        throw new mku();
    }

    public static int[] E() {
        return new int[]{1, 2, 3, 4};
    }

    public static String F(lkq lkqVar) {
        String encodeToString = Base64.encodeToString(lkqVar.g(), 10);
        encodeToString.getClass();
        return encodeToString;
    }

    public static gna G(Object obj) {
        Throwable a = mky.a(obj);
        if (a == null) {
            return new gnc(obj);
        }
        return new gmy(a);
    }

    public static Object H(gna gnaVar) {
        if (gnaVar instanceof gnc) {
            return ((gnc) gnaVar).a;
        }
        return null;
    }

    public static Object I(gna gnaVar) {
        if (gnaVar instanceof gnc) {
            return ((gnc) gnaVar).a;
        }
        if (gnaVar instanceof gmx) {
            throw ((gmx) gnaVar).a();
        }
        throw new mku();
    }

    public static Throwable J(gna gnaVar) {
        if (gnaVar instanceof gnc) {
            return null;
        }
        if (gnaVar instanceof gmx) {
            return ((gmx) gnaVar).a();
        }
        throw new mku();
    }

    public static StatusBarNotification[] K(NotificationManager notificationManager) {
        StatusBarNotification[] activeNotifications;
        notificationManager.getClass();
        try {
            activeNotifications = notificationManager.getActiveNotifications();
            activeNotifications.getClass();
            return activeNotifications;
        } catch (RuntimeException unused) {
            return new StatusBarNotification[0];
        }
    }

    public static giu L(goa goaVar) {
        goaVar.getClass();
        return new giq(goaVar);
    }

    public static /* synthetic */ gih M(ljh ljhVar) {
        ljn q = ljhVar.q();
        q.getClass();
        return (gih) q;
    }

    public static void N(long j, ljh ljhVar) {
        if (!ljhVar.b.y()) {
            ljhVar.t();
        }
        gih gihVar = (gih) ljhVar.b;
        gih gihVar2 = gih.c;
        gihVar.b = j;
    }

    public static void O(long j, ljh ljhVar) {
        if (!ljhVar.b.y()) {
            ljhVar.t();
        }
        gih gihVar = (gih) ljhVar.b;
        gih gihVar2 = gih.c;
        gihVar.a = j;
    }

    public static int P(ggk ggkVar) {
        ggkVar.getClass();
        lgm lgmVar = ggkVar.d.v;
        if (lgmVar == null) {
            lgmVar = lgm.c;
        }
        lgl lglVar = lgmVar.b;
        if (lglVar == null) {
            lglVar = lgl.c;
        }
        return lglVar.a;
    }

    public static int Q(ggk ggkVar) {
        ggkVar.getClass();
        lgl lglVar = ggkVar.d.u;
        if (lglVar == null) {
            lglVar = lgl.c;
        }
        return lglVar.a;
    }

    public static String R(ggk ggkVar) {
        ggkVar.getClass();
        lgm lgmVar = ggkVar.d.v;
        if (lgmVar == null) {
            lgmVar = lgm.c;
        }
        String str = lgmVar.a;
        str.getClass();
        return str;
    }

    public static int S(ggk ggkVar) {
        lgm lgmVar = ggkVar.d.v;
        if (lgmVar == null) {
            lgmVar = lgm.c;
        }
        lgl lglVar = lgmVar.b;
        if (lglVar == null) {
            lglVar = lgl.c;
        }
        int w = a.w(lglVar.b);
        if (w == 0) {
            return 1;
        }
        return w;
    }

    public static void T(ggk ggkVar) {
        lgl lglVar = ggkVar.d.u;
        if (lglVar == null) {
            lglVar = lgl.c;
        }
        a.w(lglVar.b);
    }

    public static gwf U(Bundle bundle) {
        String string = bundle.getString("com.google.android.libraries.notifications.ACCOUNT_REPRESENTATION");
        if (string != null && string.length() != 0) {
            return fzo.j(string);
        }
        return null;
    }

    public static void V(Bundle bundle, goa goaVar) {
        if (goaVar == null) {
            return;
        }
        bundle.putString("com.google.android.libraries.notifications.ACCOUNT_REPRESENTATION", fzo.l(goaVar.b()));
    }

    public static bym W(Bitmap bitmap) {
        fmn fmlVar;
        fma.aS(bitmap, "image must not be null");
        try {
            fsd fsdVar = b;
            fma.aS(fsdVar, "IBitmapDescriptorFactory is not initialized");
            Parcel a = fsdVar.a();
            duh.c(a, bitmap);
            Parcel b2 = fsdVar.b(6, a);
            IBinder readStrongBinder = b2.readStrongBinder();
            if (readStrongBinder == null) {
                fmlVar = null;
            } else {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                if (queryLocalInterface instanceof fmn) {
                    fmlVar = (fmn) queryLocalInterface;
                } else {
                    fmlVar = new fml(readStrongBinder);
                }
            }
            b2.recycle();
            return new bym(fmlVar);
        } catch (RemoteException e) {
            throw new fsc(e);
        }
    }

    public static float X(Context context, int i) {
        return ab(context, i).getDimension(context.getResources().getDisplayMetrics());
    }

    public static int Y(Context context, int i) {
        return context.getResources().getColor(aa(context, i));
    }

    public static int Z(Context context, int i) {
        return TypedValue.complexToDimensionPixelSize(ab(context, i).data, context.getResources().getDisplayMetrics());
    }

    public static /* synthetic */ String aA(int i) {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return "null";
                }
                return "FALSE";
            }
            return "TRUE";
        }
        return "UNKNOWN";
    }

    public static gwf aB(gxa gxaVar) {
        int i;
        gwx gwxVar;
        gww gwwVar;
        int i2 = gxaVar.a;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 != 4) {
                            i = 0;
                        } else {
                            i = 4;
                        }
                    } else {
                        i = 3;
                    }
                } else {
                    i = 2;
                }
            } else {
                i = 1;
            }
        } else {
            i = 5;
        }
        if (i != 0) {
            int i3 = i - 1;
            if (i3 != 0) {
                if (i3 != 1) {
                    if (i3 != 2) {
                        if (i3 != 3) {
                            if (i3 != 4) {
                                throw new mku();
                            }
                            throw new IllegalStateException("Account not set in account representation proto");
                        }
                        if (i2 == 4) {
                            gwwVar = (gww) gxaVar.b;
                        } else {
                            gwwVar = gww.b;
                        }
                        String str = gwwVar.a;
                        str.getClass();
                        return new gwg(str);
                    }
                    return gwq.a;
                }
                return gws.a;
            }
            if (i2 == 1) {
                gwxVar = (gwx) gxaVar.b;
            } else {
                gwxVar = gwx.b;
            }
            String str2 = gwxVar.a;
            str2.getClass();
            return new gwh(str2);
        }
        throw null;
    }

    public static Map aC(gwj gwjVar) {
        jiu jiuVar = new jiu();
        gwjVar.b(jiuVar);
        return jiuVar.b();
    }

    public static boolean aD(gwf gwfVar) {
        boolean z = false;
        if (!(gwfVar instanceof gwh) && !(gwfVar instanceof gwg)) {
            z = true;
            if (!(gwfVar instanceof gws) && !(gwfVar instanceof gwq)) {
                throw new mku();
            }
        }
        return z;
    }

    public static void aE(ljh ljhVar, int i, boolean z) {
        long j;
        if (((lgj) ljhVar.b).a.size() <= 0) {
            if (z) {
                while (((lgj) ljhVar.b).a.size() <= 0) {
                    if (!ljhVar.b.y()) {
                        ljhVar.t();
                    }
                    lgj lgjVar = (lgj) ljhVar.b;
                    lgjVar.b();
                    lgjVar.a.g(0L);
                }
            } else {
                return;
            }
        }
        long a = ((lgj) ljhVar.b).a.a(0);
        long j2 = 1 << i;
        if (z) {
            j = a | j2;
        } else {
            j = (~j2) & a;
        }
        if (!ljhVar.b.y()) {
            ljhVar.t();
        }
        lgj lgjVar2 = (lgj) ljhVar.b;
        lgjVar2.b();
        lgjVar2.a.e(0, j);
    }

    public static boolean aF(Context context, String str) {
        if (bqx.b(context, str) == 0) {
            return true;
        }
        return false;
    }

    public static boolean aG() {
        if (Build.VERSION.SDK_INT >= 23) {
            return true;
        }
        return false;
    }

    public static boolean aH() {
        if (Build.VERSION.SDK_INT >= 26) {
            return true;
        }
        return false;
    }

    public static boolean aI() {
        if (Build.VERSION.SDK_INT >= 28) {
            return true;
        }
        return false;
    }

    public static boolean aJ() {
        if (Build.VERSION.SDK_INT >= 29) {
            return true;
        }
        return false;
    }

    public static boolean aK(Context context) {
        if (aH() && context.getApplicationInfo().targetSdkVersion >= 26) {
            return true;
        }
        return false;
    }

    public static gvk aL(Context context) {
        if (context.getPackageManager().hasSystemFeature("org.chromium.arc")) {
            return gvk.f;
        }
        if (Build.VERSION.SDK_INT >= 30 && context.getPackageManager().hasSystemFeature("com.google.android.play.feature.HPE_EXPERIENCE")) {
            return gvk.e;
        }
        if (!context.getPackageManager().hasSystemFeature("com.google.android.tv") && !context.getPackageManager().hasSystemFeature("android.hardware.type.television") && !context.getPackageManager().hasSystemFeature("android.software.leanback")) {
            if (aH() && context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
                return gvk.d;
            }
            if (context.getPackageManager().hasSystemFeature("android.hardware.type.watch")) {
                return gvk.c;
            }
            return gvk.a;
        }
        return gvk.b;
    }

    public static boolean aM(Context context) {
        if ((context.getResources().getConfiguration().uiMode & 48) == 32) {
            return true;
        }
        return false;
    }

    public static String aN(Object obj) {
        Iterable mreVar;
        if (obj instanceof Iterable) {
            return aO((Iterable) obj);
        }
        if (obj instanceof Object[]) {
            Object[] objArr = (Object[]) obj;
            objArr.getClass();
            if (objArr.length == 0) {
                mreVar = mlx.a;
            } else {
                mreVar = new mre(objArr, 1);
            }
            return aO(mreVar);
        }
        String valueOf = String.valueOf(obj);
        if (obj != null && valueOf.length() != 0 && !lvd.a.a().a()) {
            return String.valueOf(valueOf.hashCode());
        }
        return valueOf;
    }

    public static String aO(Iterable iterable) {
        iterable.getClass();
        return mkm.ar(iterable, null, "[", "]", cka.n, 25);
    }

    public static int aP(lem lemVar, Set set, Map map) {
        int i;
        String str;
        int i2;
        set.getClass();
        map.getClass();
        if (lemVar == null) {
            return 0;
        }
        ljh ljhVar = (ljh) lemVar.z(5);
        ljhVar.w(lemVar);
        ktd ktdVar = new ktd(ljhVar);
        ljh ljhVar2 = (ljh) ktdVar.a;
        if (!ljhVar2.b.y()) {
            ljhVar2.t();
        }
        lem lemVar2 = (lem) ljhVar2.b;
        lemVar2.a &= -5;
        lemVar2.d = 0;
        ljh ljhVar3 = (ljh) ktdVar.a;
        if (!ljhVar3.b.y()) {
            ljhVar3.t();
        }
        lem lemVar3 = (lem) ljhVar3.b;
        lemVar3.a &= -17;
        lemVar3.g = lem.h.g;
        lmd<lel> K = ktdVar.K();
        ArrayList arrayList = new ArrayList(mkm.ap(K));
        for (lel lelVar : K) {
            ljh ljhVar4 = (ljh) lelVar.z(5);
            ljhVar4.w(lelVar);
            ktd ktdVar2 = new ktd(ljhVar4);
            ljh ljhVar5 = (ljh) ktdVar2.a;
            if (!ljhVar5.b.y()) {
                ljhVar5.t();
            }
            lel lelVar2 = (lel) ljhVar5.b;
            lel lelVar3 = lel.g;
            lelVar2.a &= -2;
            lelVar2.b = lel.g.b;
            ljh ljhVar6 = (ljh) ktdVar2.a;
            if (!ljhVar6.b.y()) {
                ljhVar6.t();
            }
            lel lelVar4 = (lel) ljhVar6.b;
            lelVar4.c = null;
            lelVar4.a &= -3;
            ljh ljhVar7 = (ljh) ktdVar2.a;
            if (!ljhVar7.b.y()) {
                ljhVar7.t();
            }
            lel lelVar5 = (lel) ljhVar7.b;
            lelVar5.a &= -17;
            lelVar5.f = lel.g.f;
            arrayList.add(ktdVar2.G());
        }
        List af = mkm.af(arrayList, new bfr(12));
        ktdVar.K();
        ljh ljhVar8 = (ljh) ktdVar.a;
        if (!ljhVar8.b.y()) {
            ljhVar8.t();
        }
        ((lem) ljhVar8.b).e = lla.a;
        ktdVar.K();
        ljh ljhVar9 = (ljh) ktdVar.a;
        if (!ljhVar9.b.y()) {
            ljhVar9.t();
        }
        lem lemVar4 = (lem) ljhVar9.b;
        lemVar4.b();
        lhv.g(af, lemVar4.e);
        lem J = ktdVar.J();
        if (J.y()) {
            i = J.i();
        } else {
            int i3 = J.y;
            if (i3 == 0) {
                i3 = J.i();
                J.y = i3;
            }
            i = i3;
        }
        ArrayList arrayList2 = new ArrayList(mkm.ap(set));
        Iterator it = set.iterator();
        while (it.hasNext()) {
            arrayList2.add(Integer.valueOf(((gwf) it.next()).a().hashCode()));
        }
        Iterator it2 = mkm.ae(arrayList2).iterator();
        while (it2.hasNext()) {
            i = (i * 53) + ((Number) it2.next()).intValue();
        }
        ArrayList<gwg> arrayList3 = new ArrayList();
        for (Object obj : set) {
            if (obj instanceof gwg) {
                arrayList3.add(obj);
            }
        }
        ArrayList arrayList4 = new ArrayList(mkm.ap(arrayList3));
        for (gwg gwgVar : arrayList3) {
            int hashCode = gwgVar.a.hashCode() * 53;
            goa goaVar = (goa) map.get(gwgVar);
            if (goaVar != null) {
                str = goaVar.d;
            } else {
                str = null;
            }
            if (str != null) {
                i2 = str.hashCode();
            } else {
                i2 = 0;
            }
            arrayList4.add(Integer.valueOf(hashCode + i2));
        }
        Iterator it3 = mkm.ae(arrayList4).iterator();
        while (it3.hasNext()) {
            i = (i * 53) + ((Number) it3.next()).intValue();
        }
        return i;
    }

    public static gny aQ(jer jerVar, mko mkoVar) {
        if (((grn) mkoVar).b().booleanValue() && !((Boolean) jerVar.e(false)).booleanValue()) {
            return gny.b;
        }
        return gny.a;
    }

    public static gsr aR(gwj gwjVar) {
        gwjVar.getClass();
        if (gwjVar instanceof gwl) {
            return gsr.b;
        }
        if (gwjVar instanceof gwn) {
            return gsr.c;
        }
        if (gwjVar instanceof gwm) {
            return gsr.d;
        }
        if (gwjVar instanceof gwi) {
            return gsr.a;
        }
        throw new mku();
    }

    public static gok aS(jer jerVar, jer jerVar2, jer jerVar3, gny gnyVar, mko mkoVar) {
        gnyVar.getClass();
        if (gnyVar.a()) {
            if (((grn) mkoVar).b().booleanValue()) {
                if (jerVar.g()) {
                    return (gok) jerVar.c();
                }
                throw new IllegalStateException("GnpRegistrationDataProvider must be provided for unified registrations");
            }
            return (gok) ((jeu) jerVar3).a;
        }
        if (gnyVar.b()) {
            if (jerVar2.g()) {
                return (gok) jerVar2.c();
            }
            throw new IllegalStateException("GnpRegistrationDataProvider must be provided for fetch-only registrations");
        }
        throw new IllegalStateException("Unsupported targetType for RegistrationDataProviderHelper");
    }

    public static int aa(Context context, int i) {
        return ab(context, i).resourceId;
    }

    public static TypedValue ab(Context context, int i) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i, typedValue, true)) {
            return typedValue;
        }
        throw new IllegalStateException("Attribute not available.");
    }

    public static boolean ac(Context context) {
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.isMaterial3Theme});
        try {
            return obtainStyledAttributes.getBoolean(0, false);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static hgu ad(haw hawVar, gyy gyyVar, Context context) {
        boolean z;
        boolean z2;
        boolean z3;
        String str;
        View.OnClickListener onClickListener;
        if (!ae(context)) {
            return null;
        }
        hgt hgtVar = new hgt(null);
        hgtVar.a(R.id.og_ai_not_set);
        hgtVar.c = -1;
        hgtVar.h = (byte) (hgtVar.h | 2);
        hgtVar.b(-1);
        hgtVar.a(R.id.og_ai_add_another_account);
        Drawable c2 = cu.c(context, R.drawable.quantum_gm_ic_person_add_vd_theme_24);
        c2.getClass();
        hgtVar.b = c2;
        String string = context.getString(R.string.og_add_another_account);
        if (string != null) {
            hgtVar.d = string;
            hgtVar.f = new hgq(gyyVar, hawVar, 4);
            hgtVar.b(90141);
            if ((hgtVar.h & 1) != 0) {
                boolean z4 = false;
                if (hgtVar.a != R.id.og_ai_not_set) {
                    z = true;
                } else {
                    z = false;
                }
                hwx.V(z, "Did you forget to setId()?");
                if ((hgtVar.h & 4) != 0) {
                    if (hgtVar.e != -1) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    hwx.V(z2, "Did you forget to setVeId()?");
                    if ((hgtVar.h & 2) != 0) {
                        int i = hgtVar.c;
                        if (hgtVar.b != null) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (i != -1) {
                            z4 = true;
                        }
                        hwx.V(z4 ^ z3, "Either icon id or icon drawable must be specified");
                        if (hgtVar.h == 7 && (str = hgtVar.d) != null && (onClickListener = hgtVar.f) != null) {
                            return new hgu(hgtVar.a, hgtVar.b, hgtVar.c, str, hgtVar.e, onClickListener, hgtVar.g);
                        }
                        StringBuilder sb = new StringBuilder();
                        if ((1 & hgtVar.h) == 0) {
                            sb.append(" id");
                        }
                        if ((hgtVar.h & 2) == 0) {
                            sb.append(" iconResId");
                        }
                        if (hgtVar.d == null) {
                            sb.append(" label");
                        }
                        if ((hgtVar.h & 4) == 0) {
                            sb.append(" veId");
                        }
                        if (hgtVar.f == null) {
                            sb.append(" onClickListener");
                        }
                        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
                    }
                    throw new IllegalStateException("Property \"iconResId\" has not been set");
                }
                throw new IllegalStateException("Property \"veId\" has not been set");
            }
            throw new IllegalStateException("Property \"id\" has not been set");
        }
        throw new NullPointerException("Null label");
    }

    public static boolean ae(Context context) {
        UserManager userManager = (UserManager) context.getSystemService("user");
        if (userManager != null && userManager.hasUserRestriction("no_modify_accounts")) {
            return false;
        }
        return true;
    }

    public static hbh af(hcc hccVar) {
        kdo kdoVar = new kdo(null, null, null, null);
        kdoVar.n(hccVar.o);
        kdoVar.i(hccVar.b);
        kdoVar.j(hccVar.i);
        kdoVar.k(hccVar.f);
        heb hebVar = hccVar.d;
        jer jerVar = hebVar.a;
        if (jerVar != null) {
            kdoVar.f = jerVar;
            jer jerVar2 = hebVar.m;
            kdoVar.e = jdl.a;
            return kdoVar.h();
        }
        throw new NullPointerException("Null deactivatedAccountsFeature");
    }

    public static jis ag(Context context, hcc hccVar, lnh lnhVar) {
        jin jinVar = new jin();
        hdy hdyVar = null;
        apc apcVar = new apc(hccVar.f, lnhVar, hccVar.b, (int[]) null);
        hdy a = hch.a(hccVar, context);
        if (a != null) {
            hha hhaVar = new hha(a.f);
            DevicePolicyManager devicePolicyManager = (DevicePolicyManager) context.getSystemService("device_policy");
            int i = 41;
            if (devicePolicyManager == null) {
                Log.e(hch.a, "Failed to get DevicePolicyManager");
            } else {
                List<ComponentName> activeAdmins = devicePolicyManager.getActiveAdmins();
                if (activeAdmins != null) {
                    Iterator<ComponentName> it = activeAdmins.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        if (devicePolicyManager.isProfileOwnerApp(it.next().getPackageName())) {
                            i = 42;
                            break;
                        }
                    }
                }
            }
            hhaVar.d(apcVar, i);
            jinVar.h(a.b(new hgz(hhaVar)));
        }
        hccVar.b.a();
        jer jerVar = hccVar.d.e;
        hgu ad = ad(hccVar.b, hccVar.c.b, context);
        if (ad != null) {
            int i2 = ad.a;
            hdw a2 = hdy.a();
            a2.e(i2);
            a2.a = ad.b;
            a2.d(ad.c);
            a2.f(ad.d);
            a2.c(ad.g);
            a2.g(ad.f);
            a2.h(ad.e);
            jinVar.h(c(a2.a(), 11, apcVar));
        }
        if (ae(context)) {
            hdw a3 = hdy.a();
            a3.e(R.id.og_ai_manage_accounts);
            Drawable c2 = cu.c(context, R.drawable.quantum_gm_ic_manage_accounts_vd_theme_24);
            c2.getClass();
            a3.a = c2;
            a3.f(context.getString(R.string.og_manage_accounts));
            a3.g(new ewu(hccVar, 2));
            a3.h(90142);
            hdyVar = a3.a();
        }
        if (hdyVar != null) {
            jinVar.h(c(hdyVar, 12, apcVar));
        }
        jis g = jinVar.g();
        jin jinVar2 = new jin();
        int i3 = ((jmi) g).c;
        int i4 = 0;
        for (int i5 = 0; i5 < i3; i5++) {
            hcp hcpVar = new hcp((hdy) g.get(i5));
            hcpVar.j(hdg.ALWAYS_HIDE_DIVIDER_CARD);
            jinVar2.h(new hcr(new hft(hcpVar, i4)));
        }
        return jinVar2.g();
    }

    public static /* synthetic */ void ah(RecyclerView recyclerView, lj ljVar) {
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.getContext();
        recyclerView.V(new LinearLayoutManager());
        hog.J(recyclerView, ljVar);
    }

    public static int ai(Context context, int i) {
        return context.getResources().getColor(i);
    }

    public static /* synthetic */ String aj(Object obj) {
        return ((hfl) obj).c;
    }

    public static /* synthetic */ String ak(Object obj) {
        return ((hfl) obj).c;
    }

    public static /* synthetic */ String am(Object obj) {
        return ((hfl) obj).b;
    }

    public static /* synthetic */ gyz an(Object obj) {
        int i;
        hfl hflVar = (hfl) obj;
        iar iarVar = new iar();
        iarVar.c(false);
        iarVar.d(1);
        iarVar.c(hflVar.f);
        iarVar.d(hflVar.h);
        if (iarVar.b == 1 && (i = iarVar.c) != 0) {
            return new gyz(iarVar.a, i);
        }
        StringBuilder sb = new StringBuilder();
        if (iarVar.b == 0) {
            sb.append(" isG1User");
        }
        if (iarVar.c == 0) {
            sb.append(" isUnicornUser");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public static boolean aq(Object obj) {
        if (obj != null) {
            return true;
        }
        return false;
    }

    public static Object ar(Object obj, jiy jiyVar, Object obj2) {
        if (obj != null) {
            Object obj3 = jiyVar.get(ak(obj));
            if (obj3 != null) {
                return obj3;
            }
            return obj2;
        }
        return null;
    }

    public static Drawable as(Context context, int i, int i2) {
        return new LayerDrawable(new Drawable[]{hog.N(new ShapeDrawable(new OvalShape()), i2), hog.O(context, R.drawable.badge_exclamation_vd, i)});
    }

    public static hao av(cfc cfcVar, jer jerVar, jer jerVar2) {
        return new hao(cfcVar, jerVar, jerVar2);
    }

    public static Integer aw(int i) {
        switch (i - 1) {
            case 1:
                return 3;
            case 2:
                return 4;
            case 3:
            case 5:
                return 1;
            case 4:
            case 6:
                return 2;
            default:
                return 0;
        }
    }

    public static void ax(TextView textView) {
        bwn.q(textView, new gzb());
    }

    public static String ay(Object obj) {
        String n;
        boolean z = az(obj).a;
        String n2 = ivc.n(am(obj));
        if (z) {
            n = "";
        } else {
            n = ivc.n(ak(obj));
        }
        if (n2.isEmpty() && n.isEmpty()) {
            return aj(obj);
        }
        if (n2.isEmpty()) {
            return n;
        }
        if (n.isEmpty()) {
            return n2;
        }
        if (n2.equals(n)) {
            return n2;
        }
        return a.an(n, n2, " ");
    }

    public static gza az(Object obj) {
        jmy jmyVar = new jmy(ak(obj));
        boolean z = false;
        if (jmyVar.c && (jmyVar.a.startsWith("/seed/") || jmyVar.b.equals("glimitedaccount.com"))) {
            z = true;
        }
        return new gza(z);
    }

    private static ClassLoader b() {
        ClassLoader classLoader = frx.class.getClassLoader();
        fma.aR(classLoader);
        return classLoader;
    }

    private static hdy c(hdy hdyVar, int i, apc apcVar) {
        hha hhaVar = new hha(hdyVar.f);
        hhaVar.d(apcVar, i);
        return hdyVar.b(new hgz(hhaVar));
    }

    public static Parcelable g(Bundle bundle, String str) {
        ClassLoader b2 = b();
        bundle.setClassLoader(b2);
        Bundle bundle2 = bundle.getBundle("map_state");
        if (bundle2 == null) {
            return null;
        }
        bundle2.setClassLoader(b2);
        return bundle2.getParcelable(str);
    }

    public static void h(Bundle bundle, Bundle bundle2) {
        if (bundle != null && bundle2 != null) {
            Parcelable g = g(bundle, "MapOptions");
            if (g != null) {
                i(bundle2, "MapOptions", g);
            }
            Parcelable g2 = g(bundle, "StreetViewPanoramaOptions");
            if (g2 != null) {
                i(bundle2, "StreetViewPanoramaOptions", g2);
            }
            Parcelable g3 = g(bundle, "camera");
            if (g3 != null) {
                i(bundle2, "camera", g3);
            }
            if (bundle.containsKey("position")) {
                bundle2.putString("position", bundle.getString("position"));
            }
            if (bundle.containsKey("com.google.android.wearable.compat.extra.LOWBIT_AMBIENT")) {
                bundle2.putBoolean("com.google.android.wearable.compat.extra.LOWBIT_AMBIENT", bundle.getBoolean("com.google.android.wearable.compat.extra.LOWBIT_AMBIENT", false));
            }
        }
    }

    public static void i(Bundle bundle, String str, Parcelable parcelable) {
        ClassLoader b2 = b();
        bundle.setClassLoader(b2);
        Bundle bundle2 = bundle.getBundle("map_state");
        if (bundle2 == null) {
            bundle2 = new Bundle();
        }
        bundle2.setClassLoader(b2);
        bundle2.putParcelable(str, parcelable);
        bundle.putBundle("map_state", bundle2);
    }

    public static byte j(Boolean bool) {
        if (bool != null) {
            if (!bool.booleanValue()) {
                return (byte) 0;
            }
            return (byte) 1;
        }
        return (byte) -1;
    }

    public static Boolean k(byte b2) {
        if (b2 != 0) {
            if (b2 != 1) {
                return null;
            }
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }

    public static String l(int i) {
        if (i != 100) {
            if (i != 102) {
                if (i != 104) {
                    if (i == 105) {
                        return "PASSIVE";
                    }
                    throw new IllegalArgumentException();
                }
                return "LOW_POWER";
            }
            return "BALANCED_POWER_ACCURACY";
        }
        return "HIGH_ACCURACY";
    }

    public static ExecutorService m(int i, ThreadFactory threadFactory) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(i, i, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), threadFactory);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return Executors.unconfigurableExecutorService(threadPoolExecutor);
    }

    public static ExecutorService n(ThreadFactory threadFactory) {
        return m(1, threadFactory);
    }

    public static boolean o() {
        if (Build.VERSION.SDK_INT >= 33) {
            return true;
        }
        return false;
    }

    public static void p(RuntimeException runtimeException) {
        ((jol) ((jol) ((jol) gdx.a.f()).i(runtimeException)).j("com/google/android/libraries/logging/ve/handlers/result/flogger/FloggerResultDaggerModule", "lambda$provideErrorHandler$0", 18, "FloggerResultDaggerModule.java")).q();
    }

    public static juw q(gcn gcnVar, boolean z) {
        List b2 = gcnVar.b();
        for (int i = !z ? 1 : 0; i < b2.size(); i++) {
            gbs gbsVar = (gbs) b2.get(i);
            juv juvVar = gbsVar.c;
            if (juvVar == null) {
                juvVar = juv.e;
            }
            if ((juvVar.a & 2048) != 0) {
                juv juvVar2 = gbsVar.c;
                if (juvVar2 == null) {
                    juvVar2 = juv.e;
                }
                juw juwVar = juvVar2.d;
                if (juwVar == null) {
                    return juw.d;
                }
                return juwVar;
            }
        }
        return null;
    }

    public static void r(int i, boolean z, ljh ljhVar, ljj[] ljjVarArr, ljh ljhVar2, gcp gcpVar) {
        ljj ljjVar = ljjVarArr[i];
        if (!ljjVar.ao(juk.a)) {
            if (z) {
                nqe nqeVar = juk.a;
                juu juuVar = (juu) ljjVar.b;
                ljjVar.ap(nqeVar, Long.valueOf((juuVar.b << 32) | (juuVar.c & 4294967295L)));
            }
        } else {
            z = true;
        }
        Iterator it = Collections.unmodifiableList(((juu) ljjVar.b).d).iterator();
        while (it.hasNext()) {
            r(((Integer) it.next()).intValue(), z, ljhVar, ljjVarArr, ljhVar2, gcpVar);
        }
    }

    public static void s(juw juwVar, gco gcoVar, gcp gcpVar, ljh ljhVar) {
        if (gcpVar.b.size() == 1) {
            if (!ljhVar.b.y()) {
                ljhVar.t();
            }
            jue jueVar = (jue) ljhVar.b;
            jue jueVar2 = jue.h;
            jueVar.d = juwVar;
            jueVar.a |= 2;
            return;
        }
        juv juvVar = w(gcoVar).c;
        if (juvVar == null) {
            juvVar = juv.e;
        }
        juw juwVar2 = juvVar.d;
        if (juwVar2 == null) {
            juwVar2 = juw.d;
        }
        if (!ljhVar.b.y()) {
            ljhVar.t();
        }
        jue jueVar3 = (jue) ljhVar.b;
        jue jueVar4 = jue.h;
        juwVar2.getClass();
        jueVar3.d = juwVar2;
        jueVar3.a |= 2;
    }

    public static /* synthetic */ void t(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((gcu) ivc.M((jyz) it.next())).a(null);
        }
    }

    public static jyz u() {
        return ivc.E(liy.a);
    }

    public static jyz v() {
        return ivc.E(null);
    }

    public static gbs w(gcn gcnVar) {
        return (gbs) gcnVar.b().get(r1.size() - 1);
    }

    public static gbs x(gcn gcnVar) {
        return (gbs) gcnVar.b().get(0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0040, code lost:            if (r0.l.m((defpackage.ljm) r6.d) != false) goto L71;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void y(defpackage.gbo r5, java.util.List r6) {
        /*
        L0:
            if (r5 == 0) goto L4b
            gbs r0 = r5.a()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L21
            juv r3 = r0.c
            if (r3 != 0) goto L10
            juv r3 = defpackage.juv.e
        L10:
            int r3 = r3.a
            r3 = r3 & 8
            if (r3 == 0) goto L18
            r3 = 1
            goto L19
        L18:
            r3 = 0
        L19:
            java.lang.String r4 = "Instrumented view has no VE ID."
            defpackage.hwx.V(r3, r4)
            r6.add(r0)
        L21:
            gbv r3 = r5.b
            gbo r3 = r3.c()
            if (r3 != 0) goto L49
            gbv r6 = r5.b
            boolean r6 = r6.e()
            if (r6 != 0) goto L42
            nqe r6 = defpackage.gec.a
            r0.h(r6)
            ljd r0 = r0.l
            java.lang.Object r6 = r6.d
            ljm r6 = (defpackage.ljm) r6
            boolean r6 = r0.m(r6)
            if (r6 == 0) goto L43
        L42:
            r1 = 1
        L43:
            java.lang.String r6 = "Activity's content root (android.R.id.content) must be annotated with a VE. CVE root was: %s"
            defpackage.hwx.X(r1, r6, r5)
            return
        L49:
            r5 = r3
            goto L0
        L4b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.frx.y(gbo, java.util.List):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0032, code lost:            r0.j(r6);     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.jjr z(java.lang.String r8) {
        /*
            java.lang.String r0 = ","
            kru r0 = defpackage.kru.g(r0)
            java.lang.Iterable r8 = r0.b(r8)
            jjp r0 = new jjp
            r0.<init>()
            java.util.Iterator r8 = r8.iterator()
        L13:
            boolean r1 = r8.hasNext()
            if (r1 == 0) goto L4e
            java.lang.Object r1 = r8.next()
            java.lang.String r1 = (java.lang.String) r1
            int r1 = java.lang.Integer.parseInt(r1)
            gwo[] r2 = defpackage.gwo.values()
            int r3 = r2.length
            r4 = 0
            r5 = 0
        L2a:
            if (r5 >= r3) goto L39
            r6 = r2[r5]
            int r7 = r6.c
            if (r7 != r1) goto L36
            r0.d(r6)
            goto L13
        L36:
            int r5 = r5 + 1
            goto L2a
        L39:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r4] = r0
            java.lang.String r0 = "Notification channel %d is not supported."
            java.lang.String r0 = java.lang.String.format(r0, r1)
            r8.<init>(r0)
            throw r8
        L4e:
            jjr r8 = r0.g()
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.frx.z(java.lang.String):jjr");
    }

    public frx(char[] cArr, byte[] bArr, byte[] bArr2) {
    }

    public frx(gnv gnvVar, gur gurVar) {
        gnvVar.getClass();
        gurVar.getClass();
    }

    public void au() {
    }

    public void a(Object obj) {
    }

    public void at(jis jisVar) {
    }
}
