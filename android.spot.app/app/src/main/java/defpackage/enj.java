package defpackage;

import android.app.Activity;
import android.content.Context;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class enj implements jfe {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ enj(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [evy, java.lang.Object] */
    @Override // defpackage.jfe
    public final Object a() {
        boolean z = true;
        switch (this.b) {
            case 0:
                return jer.i(this.a);
            case 1:
                ag f = ((eba) this.a).a.a().f("MAIN_ACTIVITY_DELEGATE_FRAGMENT");
                f.getClass();
                return f.G();
            case 2:
                return jer.h(this.a.b());
            case 3:
                exa exaVar = (exa) this.a;
                if (!exaVar.c() || !exaVar.d()) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 4:
                exa exaVar2 = (exa) this.a;
                if (!exaVar2.c() || !exaVar2.e()) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 5:
                exa exaVar3 = (exa) this.a;
                if (!exaVar3.c() || !exaVar3.g()) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 6:
                exa exaVar4 = (exa) this.a;
                if (!exaVar4.c() || !exaVar4.f()) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 7:
                return new fpe((Activity) this.a);
            case 8:
                return new gok((Context) ((ddg) this.a).a);
            case 9:
                return (gft) ((AtomicReference) this.a).get();
            case 10:
                return (gfu) ((AtomicReference) this.a).get();
            case 11:
                imq e = ((gvg) this.a).a.e("/client_streamz/gnp_android/rpc/http_rpc_executor/count", new imp("app_package_name", String.class), new imp("path", String.class), new imp("status_code", Integer.class));
                e.d();
                return e;
            case 12:
                imq e2 = ((gvg) this.a).a.e("/client_streamz/gnp_android/growthkit_job_count", new imp("package_name", String.class), new imp("job_tag", String.class), new imp("status", String.class));
                e2.d();
                return e2;
            case 13:
                imq e3 = ((gvg) this.a).a.e("/client_streamz/gnp_android/http/gnp_http_client/request_count", new imp("app_package_name", String.class), new imp("client_impl", String.class), new imp("path", String.class), new imp("status_code", Integer.class), new imp("purpose", String.class));
                e3.d();
                return e3;
            case 14:
                imq e4 = ((gvg) this.a).a.e("/client_streamz/gnp_android/promotion_shown_count", new imp("package_name", String.class), new imp("promotion_type", String.class));
                e4.d();
                return e4;
            case 15:
                imq e5 = ((gvg) this.a).a.e("/client_streamz/gnp_android/trigger_applied_count", new imp("package_name", String.class));
                e5.d();
                return e5;
            case 16:
                imq e6 = ((gvg) this.a).a.e("/client_streamz/gnp_android/targeting_applied_count", new imp("package_name", String.class));
                e6.d();
                return e6;
            case 17:
                imq e7 = ((gvg) this.a).a.e("/client_streamz/gnp_android/promotion_filtering_start_count", new imp("package_name", String.class), new imp("account_type", String.class));
                e7.d();
                return e7;
            case 18:
                imq e8 = ((gvg) this.a).a.e("/client_streamz/gnp_android/promotion_passed_ui_support_filter_count", new imp("package_name", String.class));
                e8.d();
                return e8;
            case 19:
                imq e9 = ((gvg) this.a).a.e("/client_streamz/gnp_android/promotion_passed_event_triggering_filter_count", new imp("package_name", String.class));
                e9.d();
                return e9;
            default:
                imq e10 = ((gvg) this.a).a.e("/client_streamz/gnp_android/promotion_passed_capping_filter_count", new imp("package_name", String.class));
                e10.d();
                return e10;
        }
    }
}
