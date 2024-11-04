package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class gvf implements jfe {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ gvf(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.jfe
    public final Object a() {
        hkh hkhVar;
        int i = 4;
        int i2 = 2;
        boolean z = false;
        switch (this.b) {
            case 0:
                imq e = ((gvg) this.a).a.e("/client_streamz/gnp_android/growthkit_started_count", new imp("package_name", String.class), new imp("status", String.class));
                e.d();
                return e;
            case 1:
                imq e2 = ((gvg) this.a).a.e("/client_streamz/gnp_android/growthkit_logging_count", new imp("package_name", String.class), new imp("which_log", String.class), new imp("status", String.class));
                e2.d();
                return e2;
            case 2:
                hcc hccVar = (hcc) this.a;
                return new hef(hccVar.d, hccVar.b);
            case 3:
                Object obj = this.a;
                ktn ktnVar = (ktn) obj;
                if (((hcc) ktnVar.b).d.g.g()) {
                    heb hebVar = ((hcc) ktnVar.b).d;
                    jer jerVar = hebVar.l;
                    z = ((han) hebVar.g.c()).q(jis.n(hzc.V(((hcc) ktnVar.b).b.b(), new etw(obj, i2))));
                }
                return Boolean.valueOf(z);
            case 4:
                hgf hgfVar = (hgf) this.a;
                return new hef(hgfVar.a.d, hgfVar.a.b);
            case 5:
                imq e3 = ((imu) ((hpd) this.a).k).e("/client_streamz/og_android/invalid_user_profile_switch", new imp("app_package", String.class));
                e3.d();
                return e3;
            case 6:
                imq e4 = ((imu) ((hpd) this.a).k).e("/client_streamz/og_android/load_owner_avatar_count", new imp("implementation", String.class), new imp("avatar_size", String.class), new imp("result", String.class), new imp("app_package", String.class), new imp("load_cached", Boolean.class));
                e4.d();
                return e4;
            case 7:
                imn c = ((imu) ((hpd) this.a).k).c("/client_streamz/og_android/load_owners_latency", new imp("implementation", String.class), new imp("result", String.class), new imp("number_of_owners", Integer.class), new imp("app_package", String.class), new imp("load_cached", Boolean.class));
                c.d();
                return c;
            case 8:
                imn c2 = ((imu) ((hpd) this.a).k).c("/client_streamz/og_android/load_owner_avatar_latency", new imp("implementation", String.class), new imp("avatar_size", String.class), new imp("result", String.class), new imp("app_package", String.class), new imp("load_cached", Boolean.class));
                c2.d();
                return c2;
            case 9:
                imq e5 = ((imu) ((hpd) this.a).k).e("/client_streamz/og_android/profile_cache/get_people_me", new imp("result", String.class), new imp("app_package", String.class));
                e5.d();
                return e5;
            case 10:
                imq e6 = ((imu) ((hpd) this.a).k).e("/client_streamz/og_android/lazy_provider_count", new imp("app_package", String.class));
                e6.d();
                return e6;
            case 11:
                imq e7 = ((imu) ((hpd) this.a).k).e("/client_streamz/og_android/visual_elements_usage", new imp("app_package", String.class), new imp("ve_enabled", Boolean.class), new imp("ve_provided", Boolean.class));
                e7.d();
                return e7;
            case 12:
                imq e8 = ((imu) ((hpd) this.a).k).e("/client_streamz/og_android/safety_exp_account_menu_refresh", new imp[0]);
                e8.d();
                return e8;
            case 13:
                imq e9 = ((imu) ((hpd) this.a).k).e("/client_streamz/og_android/safety_exp_default_entry_point", new imp[0]);
                e9.d();
                return e9;
            case 14:
                imq e10 = ((imu) ((hpd) this.a).k).e("/client_streamz/og_android/safety_exp_color_resolve_crash", new imp("app_package", String.class), new imp("has_material", Boolean.class), new imp("is_material3", Boolean.class), new imp("is_light_theme", Boolean.class), new imp("failing_attribute_index", Integer.class), new imp("is_next_attribute_failing", Boolean.class));
                e10.d();
                return e10;
            case 15:
                imq e11 = ((imu) ((hpd) this.a).k).e("/client_streamz/og_android/anchor_view_is_shown_on_screen_data", new imp("part_of_the_view_is_visible", Boolean.class), new imp("is_laid_out", Boolean.class), new imp("is_shown", Boolean.class));
                e11.d();
                return e11;
            case 16:
                imq e12 = ((imu) ((hpd) this.a).k).e("/client_streamz/og_android/switch_profile", new imp("result", String.class), new imp("has_category_launcher", Boolean.class), new imp("has_category_info", Boolean.class), new imp("user_in_target_user_profiles", Boolean.class), new imp("api_version", Integer.class), new imp("app_package", String.class));
                e12.d();
                return e12;
            case 17:
                imq e13 = ((imu) ((hpd) this.a).k).e("/client_streamz/og_android/load_owners_count", new imp("implementation", String.class), new imp("result", String.class), new imp("number_of_owners", Integer.class), new imp("app_package", String.class), new imp("load_cached", Boolean.class));
                e13.d();
                return e13;
            case 18:
                imq e14 = ((imu) ((hpd) this.a).k).e("/client_streamz/og_android/load_owner_count", new imp("implementation", String.class), new imp("result", String.class), new imp("app_package", String.class));
                e14.d();
                return e14;
            case 19:
                imq e15 = ((imu) ((hpd) this.a).k).e("/client_streamz/og_android/legacy/load_owners", new imp("app_package", String.class));
                e15.d();
                return e15;
            default:
                Object obj2 = this.a;
                hjz hjzVar = (hjz) obj2;
                hri hriVar = new hri(hjzVar.a, hjzVar.c);
                hiy hiyVar = new hiy(obj2, hriVar, i2);
                if (hjzVar.e.g(hjzVar.a, 19621000) == 0) {
                    hld hldVar = new hld(hjzVar.b, hiyVar, 1);
                    if (hjzVar.f == null) {
                        fsr fsrVar = new fsr(hjzVar.a);
                        ksr ksrVar = new ksr(hjzVar.a);
                        ksrVar.c = fsrVar;
                        kpb kpbVar = new kpb(jis.q(new ijx(ksrVar)));
                        imi imiVar = imi.a;
                        HashMap hashMap = new HashMap();
                        ExecutorService executorService = hjzVar.b;
                        hrb.k(ilx.a, hashMap);
                        ilv ilvVar = new ilv(executorService, kpbVar, imiVar, hashMap);
                        Context context = hjzVar.a;
                        context.getClass();
                        ExecutorService executorService2 = hjzVar.b;
                        executorService2.getClass();
                        Handler handler = hjzVar.d;
                        if (handler == null) {
                            handler = null;
                        }
                        ddg ddgVar = new ddg(context, (byte[]) null);
                        fma fmaVar = new fma();
                        if (handler == null) {
                            HandlerThread handlerThread = new HandlerThread("ProtoDataStore-Message-Handler");
                            handlerThread.start();
                            handler = new Handler(handlerThread.getLooper());
                        }
                        ilh ilhVar = new ilh();
                        ilhVar.a = context.getApplicationContext();
                        ilhVar.c = "com.google.android.gms.permission.INTERNAL_BROADCAST";
                        ilhVar.b = new etl(i);
                        ilhVar.d = handler;
                        hjzVar.f = new hpd(context, executorService2, kpbVar, ilvVar, ddgVar, fmaVar, new ilk(ilhVar), new fhq(context, fwt.a, fhl.a, fhp.a));
                    }
                    Context context2 = hjzVar.a;
                    hpd hpdVar = hjzVar.f;
                    hju hjuVar = new hju(hjzVar.a, hjzVar.b);
                    if (Build.VERSION.SDK_INT >= 26) {
                        hkhVar = new hkh(0);
                    } else {
                        hkhVar = new hkh(1);
                    }
                    return new hkt(new hld(new hkl(context2, hpdVar, hjuVar, hriVar, hkhVar), 1, hriVar, hjzVar.a.getPackageName(), 0), hldVar);
                }
                return hiyVar.a();
        }
    }
}
