package defpackage;

import android.app.Application;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gvg {
    public final imu a;
    public final jfe b;
    public final jfe c;
    public final jfe d;
    public final jfe e;
    public final jfe f;
    public final jfe g;
    public final jfe h;
    public final jfe i;
    private final imt j;
    private final jfe k;
    private final jfe l;
    private final jfe m;
    private final jfe n;
    private final jfe o;

    public gvg(ScheduledExecutorService scheduledExecutorService, kpb kpbVar, Application application) {
        final int i = 11;
        this.b = hwx.H(new enj(this, i));
        final int i2 = 13;
        this.k = hwx.H(new enj(this, i2));
        final int i3 = 4;
        this.c = hwx.H(new jfe(this) { // from class: gve
            public final /* synthetic */ gvg a;

            {
                this.a = this;
            }

            @Override // defpackage.jfe
            public final Object a() {
                switch (i3) {
                    case 0:
                        imq e = this.a.a.e("/client_streamz/gnp_android/gnp/registration/multi_login_update_request_count", new imp("app_package_name", String.class), new imp("status", String.class));
                        e.d();
                        return e;
                    case 1:
                        imq e2 = this.a.a.e("/client_streamz/gnp_android/growthkit_impressions_count", new imp("package_name", String.class), new imp("user_action", String.class));
                        e2.d();
                        return e2;
                    case 2:
                        imq e3 = this.a.a.e("/client_streamz/gnp_android/growthkit_promotions_fetched", new imp("package_name", String.class), new imp("account_type", String.class));
                        e3.d();
                        return e3;
                    case 3:
                        imq e4 = this.a.a.e("/client_streamz/gnp_android/growthkit_network_library_count", new imp("package_name", String.class), new imp("network_library", String.class), new imp("status", String.class));
                        e4.d();
                        return e4;
                    case 4:
                        imq e5 = this.a.a.e("/client_streamz/gnp_android/push/decryption/request_count", new imp("app_package_name", String.class), new imp("failure", Boolean.class), new imp("has_placeholder", Boolean.class), new imp("fetched_threads", Boolean.class));
                        e5.d();
                        return e5;
                    case 5:
                        imq e6 = this.a.a.e("/client_streamz/gnp_android/growthkit_event_logged", new imp("package_name", String.class), new imp("account_type", String.class), new imp("event_code", String.class));
                        e6.d();
                        return e6;
                    case 6:
                        imn c = this.a.a.c("/client_streamz/gnp_android/growthkit_event_processing_latency", new imp("package_name", String.class), new imp("cache_enabled", Boolean.class), new imp("optimized_flow", Boolean.class), new imp("promo_shown", Boolean.class));
                        c.d();
                        return c;
                    case 7:
                        imn c2 = this.a.a.c("/client_streamz/gnp_android/growthkit_event_queue_time", new imp("package_name", String.class), new imp("cache_enabled", Boolean.class), new imp("optimized_flow", Boolean.class), new imp("promo_shown", Boolean.class));
                        c2.d();
                        return c2;
                    case 8:
                        imn c3 = this.a.a.c("/client_streamz/gnp_android/push/decryption/latency", new imp("app_package_name", String.class), new imp("failure", Boolean.class), new imp("fetched_threads", Boolean.class));
                        c3.d();
                        return c3;
                    case 9:
                        imq e7 = this.a.a.e("/client_streamz/gnp_android/chime/chime_account_storage_facade/insert_account_to_both_storages_count", new imp("app_package_name", String.class), new imp("gnp_insertion_equals_chime", Boolean.class));
                        e7.d();
                        return e7;
                    case 10:
                        imq e8 = this.a.a.e("/client_streamz/gnp_android/chime/chime_account_storage_facade/remove_account_from_both_storages_count", new imp("app_package_name", String.class), new imp("gnp_removal_equals_chime", Boolean.class));
                        e8.d();
                        return e8;
                    case 11:
                        imq e9 = this.a.a.e("/client_streamz/gnp_android/chime/chime_account_storage_facade/update_account_on_both_storages_count", new imp("app_package_name", String.class), new imp("gnp_update_equals_chime", Boolean.class));
                        e9.d();
                        return e9;
                    case 12:
                        imq e10 = this.a.a.e("/client_streamz/gnp_android/tray_management/tray_instructions_processing_count", new imp("app_package_name", String.class), new imp("requested_tray_limit", Integer.class), new imp("above_tray_limit_count", Integer.class), new imp("requested_slot_limit", Integer.class), new imp("above_slot_limit_count", Integer.class));
                        e10.d();
                        return e10;
                    case 13:
                        imq e11 = this.a.a.e("/client_streamz/gnp_android/storage/chimegnp_storage_comparison", new imp("app_package_name", String.class), new imp("accounts_count_equal", Boolean.class), new imp("accounts_content_equal", Boolean.class), new imp("migration_performed", Boolean.class));
                        e11.d();
                        return e11;
                    case 14:
                        imq e12 = this.a.a.e("/client_streamz/chime_android/sdk/registration/request_builder_count", new imp("app_package_name", String.class), new imp("encryption_requested", Boolean.class), new imp("key_generation_result", Boolean.class));
                        e12.d();
                        return e12;
                    case 15:
                        imq e13 = this.a.a.e("/client_streamz/gnp_android/gnp/registration/multi_login_update_total_accounts_count", new imp("app_package_name", String.class), new imp("status", String.class));
                        e13.d();
                        return e13;
                    case 16:
                        imn c4 = this.a.a.c("/client_streamz/chime_android/push/decompression/latency", new imp("app_package_name", String.class), new imp("failure", Boolean.class));
                        c4.d();
                        return c4;
                    case 17:
                        imq e14 = this.a.a.e("/client_streamz/gnp_android/registration/registration_request_builder_count", new imp("app_package_name", String.class), new imp("encryption_requested", Boolean.class), new imp("key_generation_result", Boolean.class));
                        e14.d();
                        return e14;
                    case 18:
                        imq e15 = this.a.a.e("/client_streamz/gnp_android/job/chime_job_count", new imp("app_package_name", String.class), new imp("android_sdk_version", Integer.class), new imp("is_gnp_job", Boolean.class), new imp("job_key", String.class), new imp("executed_in_place", Boolean.class), new imp("result", String.class));
                        e15.d();
                        return e15;
                    case 19:
                        imq e16 = this.a.a.e("/client_streamz/gnp_android/registration/registration_request_count", new imp("app_package_name", String.class), new imp("registration_reason", String.class), new imp("status", String.class));
                        e16.d();
                        return e16;
                    default:
                        imq e17 = this.a.a.e("/client_streamz/gnp_android/job/input_builder_result_count", new imp("app_package_name", String.class), new imp("is_success", Boolean.class));
                        e17.d();
                        return e17;
                }
            }
        });
        final int i4 = 8;
        this.d = hwx.H(new jfe(this) { // from class: gve
            public final /* synthetic */ gvg a;

            {
                this.a = this;
            }

            @Override // defpackage.jfe
            public final Object a() {
                switch (i4) {
                    case 0:
                        imq e = this.a.a.e("/client_streamz/gnp_android/gnp/registration/multi_login_update_request_count", new imp("app_package_name", String.class), new imp("status", String.class));
                        e.d();
                        return e;
                    case 1:
                        imq e2 = this.a.a.e("/client_streamz/gnp_android/growthkit_impressions_count", new imp("package_name", String.class), new imp("user_action", String.class));
                        e2.d();
                        return e2;
                    case 2:
                        imq e3 = this.a.a.e("/client_streamz/gnp_android/growthkit_promotions_fetched", new imp("package_name", String.class), new imp("account_type", String.class));
                        e3.d();
                        return e3;
                    case 3:
                        imq e4 = this.a.a.e("/client_streamz/gnp_android/growthkit_network_library_count", new imp("package_name", String.class), new imp("network_library", String.class), new imp("status", String.class));
                        e4.d();
                        return e4;
                    case 4:
                        imq e5 = this.a.a.e("/client_streamz/gnp_android/push/decryption/request_count", new imp("app_package_name", String.class), new imp("failure", Boolean.class), new imp("has_placeholder", Boolean.class), new imp("fetched_threads", Boolean.class));
                        e5.d();
                        return e5;
                    case 5:
                        imq e6 = this.a.a.e("/client_streamz/gnp_android/growthkit_event_logged", new imp("package_name", String.class), new imp("account_type", String.class), new imp("event_code", String.class));
                        e6.d();
                        return e6;
                    case 6:
                        imn c = this.a.a.c("/client_streamz/gnp_android/growthkit_event_processing_latency", new imp("package_name", String.class), new imp("cache_enabled", Boolean.class), new imp("optimized_flow", Boolean.class), new imp("promo_shown", Boolean.class));
                        c.d();
                        return c;
                    case 7:
                        imn c2 = this.a.a.c("/client_streamz/gnp_android/growthkit_event_queue_time", new imp("package_name", String.class), new imp("cache_enabled", Boolean.class), new imp("optimized_flow", Boolean.class), new imp("promo_shown", Boolean.class));
                        c2.d();
                        return c2;
                    case 8:
                        imn c3 = this.a.a.c("/client_streamz/gnp_android/push/decryption/latency", new imp("app_package_name", String.class), new imp("failure", Boolean.class), new imp("fetched_threads", Boolean.class));
                        c3.d();
                        return c3;
                    case 9:
                        imq e7 = this.a.a.e("/client_streamz/gnp_android/chime/chime_account_storage_facade/insert_account_to_both_storages_count", new imp("app_package_name", String.class), new imp("gnp_insertion_equals_chime", Boolean.class));
                        e7.d();
                        return e7;
                    case 10:
                        imq e8 = this.a.a.e("/client_streamz/gnp_android/chime/chime_account_storage_facade/remove_account_from_both_storages_count", new imp("app_package_name", String.class), new imp("gnp_removal_equals_chime", Boolean.class));
                        e8.d();
                        return e8;
                    case 11:
                        imq e9 = this.a.a.e("/client_streamz/gnp_android/chime/chime_account_storage_facade/update_account_on_both_storages_count", new imp("app_package_name", String.class), new imp("gnp_update_equals_chime", Boolean.class));
                        e9.d();
                        return e9;
                    case 12:
                        imq e10 = this.a.a.e("/client_streamz/gnp_android/tray_management/tray_instructions_processing_count", new imp("app_package_name", String.class), new imp("requested_tray_limit", Integer.class), new imp("above_tray_limit_count", Integer.class), new imp("requested_slot_limit", Integer.class), new imp("above_slot_limit_count", Integer.class));
                        e10.d();
                        return e10;
                    case 13:
                        imq e11 = this.a.a.e("/client_streamz/gnp_android/storage/chimegnp_storage_comparison", new imp("app_package_name", String.class), new imp("accounts_count_equal", Boolean.class), new imp("accounts_content_equal", Boolean.class), new imp("migration_performed", Boolean.class));
                        e11.d();
                        return e11;
                    case 14:
                        imq e12 = this.a.a.e("/client_streamz/chime_android/sdk/registration/request_builder_count", new imp("app_package_name", String.class), new imp("encryption_requested", Boolean.class), new imp("key_generation_result", Boolean.class));
                        e12.d();
                        return e12;
                    case 15:
                        imq e13 = this.a.a.e("/client_streamz/gnp_android/gnp/registration/multi_login_update_total_accounts_count", new imp("app_package_name", String.class), new imp("status", String.class));
                        e13.d();
                        return e13;
                    case 16:
                        imn c4 = this.a.a.c("/client_streamz/chime_android/push/decompression/latency", new imp("app_package_name", String.class), new imp("failure", Boolean.class));
                        c4.d();
                        return c4;
                    case 17:
                        imq e14 = this.a.a.e("/client_streamz/gnp_android/registration/registration_request_builder_count", new imp("app_package_name", String.class), new imp("encryption_requested", Boolean.class), new imp("key_generation_result", Boolean.class));
                        e14.d();
                        return e14;
                    case 18:
                        imq e15 = this.a.a.e("/client_streamz/gnp_android/job/chime_job_count", new imp("app_package_name", String.class), new imp("android_sdk_version", Integer.class), new imp("is_gnp_job", Boolean.class), new imp("job_key", String.class), new imp("executed_in_place", Boolean.class), new imp("result", String.class));
                        e15.d();
                        return e15;
                    case 19:
                        imq e16 = this.a.a.e("/client_streamz/gnp_android/registration/registration_request_count", new imp("app_package_name", String.class), new imp("registration_reason", String.class), new imp("status", String.class));
                        e16.d();
                        return e16;
                    default:
                        imq e17 = this.a.a.e("/client_streamz/gnp_android/job/input_builder_result_count", new imp("app_package_name", String.class), new imp("is_success", Boolean.class));
                        e17.d();
                        return e17;
                }
            }
        });
        final int i5 = 9;
        hwx.H(new jfe(this) { // from class: gve
            public final /* synthetic */ gvg a;

            {
                this.a = this;
            }

            @Override // defpackage.jfe
            public final Object a() {
                switch (i5) {
                    case 0:
                        imq e = this.a.a.e("/client_streamz/gnp_android/gnp/registration/multi_login_update_request_count", new imp("app_package_name", String.class), new imp("status", String.class));
                        e.d();
                        return e;
                    case 1:
                        imq e2 = this.a.a.e("/client_streamz/gnp_android/growthkit_impressions_count", new imp("package_name", String.class), new imp("user_action", String.class));
                        e2.d();
                        return e2;
                    case 2:
                        imq e3 = this.a.a.e("/client_streamz/gnp_android/growthkit_promotions_fetched", new imp("package_name", String.class), new imp("account_type", String.class));
                        e3.d();
                        return e3;
                    case 3:
                        imq e4 = this.a.a.e("/client_streamz/gnp_android/growthkit_network_library_count", new imp("package_name", String.class), new imp("network_library", String.class), new imp("status", String.class));
                        e4.d();
                        return e4;
                    case 4:
                        imq e5 = this.a.a.e("/client_streamz/gnp_android/push/decryption/request_count", new imp("app_package_name", String.class), new imp("failure", Boolean.class), new imp("has_placeholder", Boolean.class), new imp("fetched_threads", Boolean.class));
                        e5.d();
                        return e5;
                    case 5:
                        imq e6 = this.a.a.e("/client_streamz/gnp_android/growthkit_event_logged", new imp("package_name", String.class), new imp("account_type", String.class), new imp("event_code", String.class));
                        e6.d();
                        return e6;
                    case 6:
                        imn c = this.a.a.c("/client_streamz/gnp_android/growthkit_event_processing_latency", new imp("package_name", String.class), new imp("cache_enabled", Boolean.class), new imp("optimized_flow", Boolean.class), new imp("promo_shown", Boolean.class));
                        c.d();
                        return c;
                    case 7:
                        imn c2 = this.a.a.c("/client_streamz/gnp_android/growthkit_event_queue_time", new imp("package_name", String.class), new imp("cache_enabled", Boolean.class), new imp("optimized_flow", Boolean.class), new imp("promo_shown", Boolean.class));
                        c2.d();
                        return c2;
                    case 8:
                        imn c3 = this.a.a.c("/client_streamz/gnp_android/push/decryption/latency", new imp("app_package_name", String.class), new imp("failure", Boolean.class), new imp("fetched_threads", Boolean.class));
                        c3.d();
                        return c3;
                    case 9:
                        imq e7 = this.a.a.e("/client_streamz/gnp_android/chime/chime_account_storage_facade/insert_account_to_both_storages_count", new imp("app_package_name", String.class), new imp("gnp_insertion_equals_chime", Boolean.class));
                        e7.d();
                        return e7;
                    case 10:
                        imq e8 = this.a.a.e("/client_streamz/gnp_android/chime/chime_account_storage_facade/remove_account_from_both_storages_count", new imp("app_package_name", String.class), new imp("gnp_removal_equals_chime", Boolean.class));
                        e8.d();
                        return e8;
                    case 11:
                        imq e9 = this.a.a.e("/client_streamz/gnp_android/chime/chime_account_storage_facade/update_account_on_both_storages_count", new imp("app_package_name", String.class), new imp("gnp_update_equals_chime", Boolean.class));
                        e9.d();
                        return e9;
                    case 12:
                        imq e10 = this.a.a.e("/client_streamz/gnp_android/tray_management/tray_instructions_processing_count", new imp("app_package_name", String.class), new imp("requested_tray_limit", Integer.class), new imp("above_tray_limit_count", Integer.class), new imp("requested_slot_limit", Integer.class), new imp("above_slot_limit_count", Integer.class));
                        e10.d();
                        return e10;
                    case 13:
                        imq e11 = this.a.a.e("/client_streamz/gnp_android/storage/chimegnp_storage_comparison", new imp("app_package_name", String.class), new imp("accounts_count_equal", Boolean.class), new imp("accounts_content_equal", Boolean.class), new imp("migration_performed", Boolean.class));
                        e11.d();
                        return e11;
                    case 14:
                        imq e12 = this.a.a.e("/client_streamz/chime_android/sdk/registration/request_builder_count", new imp("app_package_name", String.class), new imp("encryption_requested", Boolean.class), new imp("key_generation_result", Boolean.class));
                        e12.d();
                        return e12;
                    case 15:
                        imq e13 = this.a.a.e("/client_streamz/gnp_android/gnp/registration/multi_login_update_total_accounts_count", new imp("app_package_name", String.class), new imp("status", String.class));
                        e13.d();
                        return e13;
                    case 16:
                        imn c4 = this.a.a.c("/client_streamz/chime_android/push/decompression/latency", new imp("app_package_name", String.class), new imp("failure", Boolean.class));
                        c4.d();
                        return c4;
                    case 17:
                        imq e14 = this.a.a.e("/client_streamz/gnp_android/registration/registration_request_builder_count", new imp("app_package_name", String.class), new imp("encryption_requested", Boolean.class), new imp("key_generation_result", Boolean.class));
                        e14.d();
                        return e14;
                    case 18:
                        imq e15 = this.a.a.e("/client_streamz/gnp_android/job/chime_job_count", new imp("app_package_name", String.class), new imp("android_sdk_version", Integer.class), new imp("is_gnp_job", Boolean.class), new imp("job_key", String.class), new imp("executed_in_place", Boolean.class), new imp("result", String.class));
                        e15.d();
                        return e15;
                    case 19:
                        imq e16 = this.a.a.e("/client_streamz/gnp_android/registration/registration_request_count", new imp("app_package_name", String.class), new imp("registration_reason", String.class), new imp("status", String.class));
                        e16.d();
                        return e16;
                    default:
                        imq e17 = this.a.a.e("/client_streamz/gnp_android/job/input_builder_result_count", new imp("app_package_name", String.class), new imp("is_success", Boolean.class));
                        e17.d();
                        return e17;
                }
            }
        });
        final int i6 = 10;
        hwx.H(new jfe(this) { // from class: gve
            public final /* synthetic */ gvg a;

            {
                this.a = this;
            }

            @Override // defpackage.jfe
            public final Object a() {
                switch (i6) {
                    case 0:
                        imq e = this.a.a.e("/client_streamz/gnp_android/gnp/registration/multi_login_update_request_count", new imp("app_package_name", String.class), new imp("status", String.class));
                        e.d();
                        return e;
                    case 1:
                        imq e2 = this.a.a.e("/client_streamz/gnp_android/growthkit_impressions_count", new imp("package_name", String.class), new imp("user_action", String.class));
                        e2.d();
                        return e2;
                    case 2:
                        imq e3 = this.a.a.e("/client_streamz/gnp_android/growthkit_promotions_fetched", new imp("package_name", String.class), new imp("account_type", String.class));
                        e3.d();
                        return e3;
                    case 3:
                        imq e4 = this.a.a.e("/client_streamz/gnp_android/growthkit_network_library_count", new imp("package_name", String.class), new imp("network_library", String.class), new imp("status", String.class));
                        e4.d();
                        return e4;
                    case 4:
                        imq e5 = this.a.a.e("/client_streamz/gnp_android/push/decryption/request_count", new imp("app_package_name", String.class), new imp("failure", Boolean.class), new imp("has_placeholder", Boolean.class), new imp("fetched_threads", Boolean.class));
                        e5.d();
                        return e5;
                    case 5:
                        imq e6 = this.a.a.e("/client_streamz/gnp_android/growthkit_event_logged", new imp("package_name", String.class), new imp("account_type", String.class), new imp("event_code", String.class));
                        e6.d();
                        return e6;
                    case 6:
                        imn c = this.a.a.c("/client_streamz/gnp_android/growthkit_event_processing_latency", new imp("package_name", String.class), new imp("cache_enabled", Boolean.class), new imp("optimized_flow", Boolean.class), new imp("promo_shown", Boolean.class));
                        c.d();
                        return c;
                    case 7:
                        imn c2 = this.a.a.c("/client_streamz/gnp_android/growthkit_event_queue_time", new imp("package_name", String.class), new imp("cache_enabled", Boolean.class), new imp("optimized_flow", Boolean.class), new imp("promo_shown", Boolean.class));
                        c2.d();
                        return c2;
                    case 8:
                        imn c3 = this.a.a.c("/client_streamz/gnp_android/push/decryption/latency", new imp("app_package_name", String.class), new imp("failure", Boolean.class), new imp("fetched_threads", Boolean.class));
                        c3.d();
                        return c3;
                    case 9:
                        imq e7 = this.a.a.e("/client_streamz/gnp_android/chime/chime_account_storage_facade/insert_account_to_both_storages_count", new imp("app_package_name", String.class), new imp("gnp_insertion_equals_chime", Boolean.class));
                        e7.d();
                        return e7;
                    case 10:
                        imq e8 = this.a.a.e("/client_streamz/gnp_android/chime/chime_account_storage_facade/remove_account_from_both_storages_count", new imp("app_package_name", String.class), new imp("gnp_removal_equals_chime", Boolean.class));
                        e8.d();
                        return e8;
                    case 11:
                        imq e9 = this.a.a.e("/client_streamz/gnp_android/chime/chime_account_storage_facade/update_account_on_both_storages_count", new imp("app_package_name", String.class), new imp("gnp_update_equals_chime", Boolean.class));
                        e9.d();
                        return e9;
                    case 12:
                        imq e10 = this.a.a.e("/client_streamz/gnp_android/tray_management/tray_instructions_processing_count", new imp("app_package_name", String.class), new imp("requested_tray_limit", Integer.class), new imp("above_tray_limit_count", Integer.class), new imp("requested_slot_limit", Integer.class), new imp("above_slot_limit_count", Integer.class));
                        e10.d();
                        return e10;
                    case 13:
                        imq e11 = this.a.a.e("/client_streamz/gnp_android/storage/chimegnp_storage_comparison", new imp("app_package_name", String.class), new imp("accounts_count_equal", Boolean.class), new imp("accounts_content_equal", Boolean.class), new imp("migration_performed", Boolean.class));
                        e11.d();
                        return e11;
                    case 14:
                        imq e12 = this.a.a.e("/client_streamz/chime_android/sdk/registration/request_builder_count", new imp("app_package_name", String.class), new imp("encryption_requested", Boolean.class), new imp("key_generation_result", Boolean.class));
                        e12.d();
                        return e12;
                    case 15:
                        imq e13 = this.a.a.e("/client_streamz/gnp_android/gnp/registration/multi_login_update_total_accounts_count", new imp("app_package_name", String.class), new imp("status", String.class));
                        e13.d();
                        return e13;
                    case 16:
                        imn c4 = this.a.a.c("/client_streamz/chime_android/push/decompression/latency", new imp("app_package_name", String.class), new imp("failure", Boolean.class));
                        c4.d();
                        return c4;
                    case 17:
                        imq e14 = this.a.a.e("/client_streamz/gnp_android/registration/registration_request_builder_count", new imp("app_package_name", String.class), new imp("encryption_requested", Boolean.class), new imp("key_generation_result", Boolean.class));
                        e14.d();
                        return e14;
                    case 18:
                        imq e15 = this.a.a.e("/client_streamz/gnp_android/job/chime_job_count", new imp("app_package_name", String.class), new imp("android_sdk_version", Integer.class), new imp("is_gnp_job", Boolean.class), new imp("job_key", String.class), new imp("executed_in_place", Boolean.class), new imp("result", String.class));
                        e15.d();
                        return e15;
                    case 19:
                        imq e16 = this.a.a.e("/client_streamz/gnp_android/registration/registration_request_count", new imp("app_package_name", String.class), new imp("registration_reason", String.class), new imp("status", String.class));
                        e16.d();
                        return e16;
                    default:
                        imq e17 = this.a.a.e("/client_streamz/gnp_android/job/input_builder_result_count", new imp("app_package_name", String.class), new imp("is_success", Boolean.class));
                        e17.d();
                        return e17;
                }
            }
        });
        hwx.H(new jfe(this) { // from class: gve
            public final /* synthetic */ gvg a;

            {
                this.a = this;
            }

            @Override // defpackage.jfe
            public final Object a() {
                switch (i) {
                    case 0:
                        imq e = this.a.a.e("/client_streamz/gnp_android/gnp/registration/multi_login_update_request_count", new imp("app_package_name", String.class), new imp("status", String.class));
                        e.d();
                        return e;
                    case 1:
                        imq e2 = this.a.a.e("/client_streamz/gnp_android/growthkit_impressions_count", new imp("package_name", String.class), new imp("user_action", String.class));
                        e2.d();
                        return e2;
                    case 2:
                        imq e3 = this.a.a.e("/client_streamz/gnp_android/growthkit_promotions_fetched", new imp("package_name", String.class), new imp("account_type", String.class));
                        e3.d();
                        return e3;
                    case 3:
                        imq e4 = this.a.a.e("/client_streamz/gnp_android/growthkit_network_library_count", new imp("package_name", String.class), new imp("network_library", String.class), new imp("status", String.class));
                        e4.d();
                        return e4;
                    case 4:
                        imq e5 = this.a.a.e("/client_streamz/gnp_android/push/decryption/request_count", new imp("app_package_name", String.class), new imp("failure", Boolean.class), new imp("has_placeholder", Boolean.class), new imp("fetched_threads", Boolean.class));
                        e5.d();
                        return e5;
                    case 5:
                        imq e6 = this.a.a.e("/client_streamz/gnp_android/growthkit_event_logged", new imp("package_name", String.class), new imp("account_type", String.class), new imp("event_code", String.class));
                        e6.d();
                        return e6;
                    case 6:
                        imn c = this.a.a.c("/client_streamz/gnp_android/growthkit_event_processing_latency", new imp("package_name", String.class), new imp("cache_enabled", Boolean.class), new imp("optimized_flow", Boolean.class), new imp("promo_shown", Boolean.class));
                        c.d();
                        return c;
                    case 7:
                        imn c2 = this.a.a.c("/client_streamz/gnp_android/growthkit_event_queue_time", new imp("package_name", String.class), new imp("cache_enabled", Boolean.class), new imp("optimized_flow", Boolean.class), new imp("promo_shown", Boolean.class));
                        c2.d();
                        return c2;
                    case 8:
                        imn c3 = this.a.a.c("/client_streamz/gnp_android/push/decryption/latency", new imp("app_package_name", String.class), new imp("failure", Boolean.class), new imp("fetched_threads", Boolean.class));
                        c3.d();
                        return c3;
                    case 9:
                        imq e7 = this.a.a.e("/client_streamz/gnp_android/chime/chime_account_storage_facade/insert_account_to_both_storages_count", new imp("app_package_name", String.class), new imp("gnp_insertion_equals_chime", Boolean.class));
                        e7.d();
                        return e7;
                    case 10:
                        imq e8 = this.a.a.e("/client_streamz/gnp_android/chime/chime_account_storage_facade/remove_account_from_both_storages_count", new imp("app_package_name", String.class), new imp("gnp_removal_equals_chime", Boolean.class));
                        e8.d();
                        return e8;
                    case 11:
                        imq e9 = this.a.a.e("/client_streamz/gnp_android/chime/chime_account_storage_facade/update_account_on_both_storages_count", new imp("app_package_name", String.class), new imp("gnp_update_equals_chime", Boolean.class));
                        e9.d();
                        return e9;
                    case 12:
                        imq e10 = this.a.a.e("/client_streamz/gnp_android/tray_management/tray_instructions_processing_count", new imp("app_package_name", String.class), new imp("requested_tray_limit", Integer.class), new imp("above_tray_limit_count", Integer.class), new imp("requested_slot_limit", Integer.class), new imp("above_slot_limit_count", Integer.class));
                        e10.d();
                        return e10;
                    case 13:
                        imq e11 = this.a.a.e("/client_streamz/gnp_android/storage/chimegnp_storage_comparison", new imp("app_package_name", String.class), new imp("accounts_count_equal", Boolean.class), new imp("accounts_content_equal", Boolean.class), new imp("migration_performed", Boolean.class));
                        e11.d();
                        return e11;
                    case 14:
                        imq e12 = this.a.a.e("/client_streamz/chime_android/sdk/registration/request_builder_count", new imp("app_package_name", String.class), new imp("encryption_requested", Boolean.class), new imp("key_generation_result", Boolean.class));
                        e12.d();
                        return e12;
                    case 15:
                        imq e13 = this.a.a.e("/client_streamz/gnp_android/gnp/registration/multi_login_update_total_accounts_count", new imp("app_package_name", String.class), new imp("status", String.class));
                        e13.d();
                        return e13;
                    case 16:
                        imn c4 = this.a.a.c("/client_streamz/chime_android/push/decompression/latency", new imp("app_package_name", String.class), new imp("failure", Boolean.class));
                        c4.d();
                        return c4;
                    case 17:
                        imq e14 = this.a.a.e("/client_streamz/gnp_android/registration/registration_request_builder_count", new imp("app_package_name", String.class), new imp("encryption_requested", Boolean.class), new imp("key_generation_result", Boolean.class));
                        e14.d();
                        return e14;
                    case 18:
                        imq e15 = this.a.a.e("/client_streamz/gnp_android/job/chime_job_count", new imp("app_package_name", String.class), new imp("android_sdk_version", Integer.class), new imp("is_gnp_job", Boolean.class), new imp("job_key", String.class), new imp("executed_in_place", Boolean.class), new imp("result", String.class));
                        e15.d();
                        return e15;
                    case 19:
                        imq e16 = this.a.a.e("/client_streamz/gnp_android/registration/registration_request_count", new imp("app_package_name", String.class), new imp("registration_reason", String.class), new imp("status", String.class));
                        e16.d();
                        return e16;
                    default:
                        imq e17 = this.a.a.e("/client_streamz/gnp_android/job/input_builder_result_count", new imp("app_package_name", String.class), new imp("is_success", Boolean.class));
                        e17.d();
                        return e17;
                }
            }
        });
        hwx.H(new jfe(this) { // from class: gve
            public final /* synthetic */ gvg a;

            {
                this.a = this;
            }

            @Override // defpackage.jfe
            public final Object a() {
                switch (i2) {
                    case 0:
                        imq e = this.a.a.e("/client_streamz/gnp_android/gnp/registration/multi_login_update_request_count", new imp("app_package_name", String.class), new imp("status", String.class));
                        e.d();
                        return e;
                    case 1:
                        imq e2 = this.a.a.e("/client_streamz/gnp_android/growthkit_impressions_count", new imp("package_name", String.class), new imp("user_action", String.class));
                        e2.d();
                        return e2;
                    case 2:
                        imq e3 = this.a.a.e("/client_streamz/gnp_android/growthkit_promotions_fetched", new imp("package_name", String.class), new imp("account_type", String.class));
                        e3.d();
                        return e3;
                    case 3:
                        imq e4 = this.a.a.e("/client_streamz/gnp_android/growthkit_network_library_count", new imp("package_name", String.class), new imp("network_library", String.class), new imp("status", String.class));
                        e4.d();
                        return e4;
                    case 4:
                        imq e5 = this.a.a.e("/client_streamz/gnp_android/push/decryption/request_count", new imp("app_package_name", String.class), new imp("failure", Boolean.class), new imp("has_placeholder", Boolean.class), new imp("fetched_threads", Boolean.class));
                        e5.d();
                        return e5;
                    case 5:
                        imq e6 = this.a.a.e("/client_streamz/gnp_android/growthkit_event_logged", new imp("package_name", String.class), new imp("account_type", String.class), new imp("event_code", String.class));
                        e6.d();
                        return e6;
                    case 6:
                        imn c = this.a.a.c("/client_streamz/gnp_android/growthkit_event_processing_latency", new imp("package_name", String.class), new imp("cache_enabled", Boolean.class), new imp("optimized_flow", Boolean.class), new imp("promo_shown", Boolean.class));
                        c.d();
                        return c;
                    case 7:
                        imn c2 = this.a.a.c("/client_streamz/gnp_android/growthkit_event_queue_time", new imp("package_name", String.class), new imp("cache_enabled", Boolean.class), new imp("optimized_flow", Boolean.class), new imp("promo_shown", Boolean.class));
                        c2.d();
                        return c2;
                    case 8:
                        imn c3 = this.a.a.c("/client_streamz/gnp_android/push/decryption/latency", new imp("app_package_name", String.class), new imp("failure", Boolean.class), new imp("fetched_threads", Boolean.class));
                        c3.d();
                        return c3;
                    case 9:
                        imq e7 = this.a.a.e("/client_streamz/gnp_android/chime/chime_account_storage_facade/insert_account_to_both_storages_count", new imp("app_package_name", String.class), new imp("gnp_insertion_equals_chime", Boolean.class));
                        e7.d();
                        return e7;
                    case 10:
                        imq e8 = this.a.a.e("/client_streamz/gnp_android/chime/chime_account_storage_facade/remove_account_from_both_storages_count", new imp("app_package_name", String.class), new imp("gnp_removal_equals_chime", Boolean.class));
                        e8.d();
                        return e8;
                    case 11:
                        imq e9 = this.a.a.e("/client_streamz/gnp_android/chime/chime_account_storage_facade/update_account_on_both_storages_count", new imp("app_package_name", String.class), new imp("gnp_update_equals_chime", Boolean.class));
                        e9.d();
                        return e9;
                    case 12:
                        imq e10 = this.a.a.e("/client_streamz/gnp_android/tray_management/tray_instructions_processing_count", new imp("app_package_name", String.class), new imp("requested_tray_limit", Integer.class), new imp("above_tray_limit_count", Integer.class), new imp("requested_slot_limit", Integer.class), new imp("above_slot_limit_count", Integer.class));
                        e10.d();
                        return e10;
                    case 13:
                        imq e11 = this.a.a.e("/client_streamz/gnp_android/storage/chimegnp_storage_comparison", new imp("app_package_name", String.class), new imp("accounts_count_equal", Boolean.class), new imp("accounts_content_equal", Boolean.class), new imp("migration_performed", Boolean.class));
                        e11.d();
                        return e11;
                    case 14:
                        imq e12 = this.a.a.e("/client_streamz/chime_android/sdk/registration/request_builder_count", new imp("app_package_name", String.class), new imp("encryption_requested", Boolean.class), new imp("key_generation_result", Boolean.class));
                        e12.d();
                        return e12;
                    case 15:
                        imq e13 = this.a.a.e("/client_streamz/gnp_android/gnp/registration/multi_login_update_total_accounts_count", new imp("app_package_name", String.class), new imp("status", String.class));
                        e13.d();
                        return e13;
                    case 16:
                        imn c4 = this.a.a.c("/client_streamz/chime_android/push/decompression/latency", new imp("app_package_name", String.class), new imp("failure", Boolean.class));
                        c4.d();
                        return c4;
                    case 17:
                        imq e14 = this.a.a.e("/client_streamz/gnp_android/registration/registration_request_builder_count", new imp("app_package_name", String.class), new imp("encryption_requested", Boolean.class), new imp("key_generation_result", Boolean.class));
                        e14.d();
                        return e14;
                    case 18:
                        imq e15 = this.a.a.e("/client_streamz/gnp_android/job/chime_job_count", new imp("app_package_name", String.class), new imp("android_sdk_version", Integer.class), new imp("is_gnp_job", Boolean.class), new imp("job_key", String.class), new imp("executed_in_place", Boolean.class), new imp("result", String.class));
                        e15.d();
                        return e15;
                    case 19:
                        imq e16 = this.a.a.e("/client_streamz/gnp_android/registration/registration_request_count", new imp("app_package_name", String.class), new imp("registration_reason", String.class), new imp("status", String.class));
                        e16.d();
                        return e16;
                    default:
                        imq e17 = this.a.a.e("/client_streamz/gnp_android/job/input_builder_result_count", new imp("app_package_name", String.class), new imp("is_success", Boolean.class));
                        e17.d();
                        return e17;
                }
            }
        });
        final int i7 = 14;
        this.e = hwx.H(new jfe(this) { // from class: gve
            public final /* synthetic */ gvg a;

            {
                this.a = this;
            }

            @Override // defpackage.jfe
            public final Object a() {
                switch (i7) {
                    case 0:
                        imq e = this.a.a.e("/client_streamz/gnp_android/gnp/registration/multi_login_update_request_count", new imp("app_package_name", String.class), new imp("status", String.class));
                        e.d();
                        return e;
                    case 1:
                        imq e2 = this.a.a.e("/client_streamz/gnp_android/growthkit_impressions_count", new imp("package_name", String.class), new imp("user_action", String.class));
                        e2.d();
                        return e2;
                    case 2:
                        imq e3 = this.a.a.e("/client_streamz/gnp_android/growthkit_promotions_fetched", new imp("package_name", String.class), new imp("account_type", String.class));
                        e3.d();
                        return e3;
                    case 3:
                        imq e4 = this.a.a.e("/client_streamz/gnp_android/growthkit_network_library_count", new imp("package_name", String.class), new imp("network_library", String.class), new imp("status", String.class));
                        e4.d();
                        return e4;
                    case 4:
                        imq e5 = this.a.a.e("/client_streamz/gnp_android/push/decryption/request_count", new imp("app_package_name", String.class), new imp("failure", Boolean.class), new imp("has_placeholder", Boolean.class), new imp("fetched_threads", Boolean.class));
                        e5.d();
                        return e5;
                    case 5:
                        imq e6 = this.a.a.e("/client_streamz/gnp_android/growthkit_event_logged", new imp("package_name", String.class), new imp("account_type", String.class), new imp("event_code", String.class));
                        e6.d();
                        return e6;
                    case 6:
                        imn c = this.a.a.c("/client_streamz/gnp_android/growthkit_event_processing_latency", new imp("package_name", String.class), new imp("cache_enabled", Boolean.class), new imp("optimized_flow", Boolean.class), new imp("promo_shown", Boolean.class));
                        c.d();
                        return c;
                    case 7:
                        imn c2 = this.a.a.c("/client_streamz/gnp_android/growthkit_event_queue_time", new imp("package_name", String.class), new imp("cache_enabled", Boolean.class), new imp("optimized_flow", Boolean.class), new imp("promo_shown", Boolean.class));
                        c2.d();
                        return c2;
                    case 8:
                        imn c3 = this.a.a.c("/client_streamz/gnp_android/push/decryption/latency", new imp("app_package_name", String.class), new imp("failure", Boolean.class), new imp("fetched_threads", Boolean.class));
                        c3.d();
                        return c3;
                    case 9:
                        imq e7 = this.a.a.e("/client_streamz/gnp_android/chime/chime_account_storage_facade/insert_account_to_both_storages_count", new imp("app_package_name", String.class), new imp("gnp_insertion_equals_chime", Boolean.class));
                        e7.d();
                        return e7;
                    case 10:
                        imq e8 = this.a.a.e("/client_streamz/gnp_android/chime/chime_account_storage_facade/remove_account_from_both_storages_count", new imp("app_package_name", String.class), new imp("gnp_removal_equals_chime", Boolean.class));
                        e8.d();
                        return e8;
                    case 11:
                        imq e9 = this.a.a.e("/client_streamz/gnp_android/chime/chime_account_storage_facade/update_account_on_both_storages_count", new imp("app_package_name", String.class), new imp("gnp_update_equals_chime", Boolean.class));
                        e9.d();
                        return e9;
                    case 12:
                        imq e10 = this.a.a.e("/client_streamz/gnp_android/tray_management/tray_instructions_processing_count", new imp("app_package_name", String.class), new imp("requested_tray_limit", Integer.class), new imp("above_tray_limit_count", Integer.class), new imp("requested_slot_limit", Integer.class), new imp("above_slot_limit_count", Integer.class));
                        e10.d();
                        return e10;
                    case 13:
                        imq e11 = this.a.a.e("/client_streamz/gnp_android/storage/chimegnp_storage_comparison", new imp("app_package_name", String.class), new imp("accounts_count_equal", Boolean.class), new imp("accounts_content_equal", Boolean.class), new imp("migration_performed", Boolean.class));
                        e11.d();
                        return e11;
                    case 14:
                        imq e12 = this.a.a.e("/client_streamz/chime_android/sdk/registration/request_builder_count", new imp("app_package_name", String.class), new imp("encryption_requested", Boolean.class), new imp("key_generation_result", Boolean.class));
                        e12.d();
                        return e12;
                    case 15:
                        imq e13 = this.a.a.e("/client_streamz/gnp_android/gnp/registration/multi_login_update_total_accounts_count", new imp("app_package_name", String.class), new imp("status", String.class));
                        e13.d();
                        return e13;
                    case 16:
                        imn c4 = this.a.a.c("/client_streamz/chime_android/push/decompression/latency", new imp("app_package_name", String.class), new imp("failure", Boolean.class));
                        c4.d();
                        return c4;
                    case 17:
                        imq e14 = this.a.a.e("/client_streamz/gnp_android/registration/registration_request_builder_count", new imp("app_package_name", String.class), new imp("encryption_requested", Boolean.class), new imp("key_generation_result", Boolean.class));
                        e14.d();
                        return e14;
                    case 18:
                        imq e15 = this.a.a.e("/client_streamz/gnp_android/job/chime_job_count", new imp("app_package_name", String.class), new imp("android_sdk_version", Integer.class), new imp("is_gnp_job", Boolean.class), new imp("job_key", String.class), new imp("executed_in_place", Boolean.class), new imp("result", String.class));
                        e15.d();
                        return e15;
                    case 19:
                        imq e16 = this.a.a.e("/client_streamz/gnp_android/registration/registration_request_count", new imp("app_package_name", String.class), new imp("registration_reason", String.class), new imp("status", String.class));
                        e16.d();
                        return e16;
                    default:
                        imq e17 = this.a.a.e("/client_streamz/gnp_android/job/input_builder_result_count", new imp("app_package_name", String.class), new imp("is_success", Boolean.class));
                        e17.d();
                        return e17;
                }
            }
        });
        final int i8 = 15;
        this.l = hwx.H(new jfe(this) { // from class: gve
            public final /* synthetic */ gvg a;

            {
                this.a = this;
            }

            @Override // defpackage.jfe
            public final Object a() {
                switch (i8) {
                    case 0:
                        imq e = this.a.a.e("/client_streamz/gnp_android/gnp/registration/multi_login_update_request_count", new imp("app_package_name", String.class), new imp("status", String.class));
                        e.d();
                        return e;
                    case 1:
                        imq e2 = this.a.a.e("/client_streamz/gnp_android/growthkit_impressions_count", new imp("package_name", String.class), new imp("user_action", String.class));
                        e2.d();
                        return e2;
                    case 2:
                        imq e3 = this.a.a.e("/client_streamz/gnp_android/growthkit_promotions_fetched", new imp("package_name", String.class), new imp("account_type", String.class));
                        e3.d();
                        return e3;
                    case 3:
                        imq e4 = this.a.a.e("/client_streamz/gnp_android/growthkit_network_library_count", new imp("package_name", String.class), new imp("network_library", String.class), new imp("status", String.class));
                        e4.d();
                        return e4;
                    case 4:
                        imq e5 = this.a.a.e("/client_streamz/gnp_android/push/decryption/request_count", new imp("app_package_name", String.class), new imp("failure", Boolean.class), new imp("has_placeholder", Boolean.class), new imp("fetched_threads", Boolean.class));
                        e5.d();
                        return e5;
                    case 5:
                        imq e6 = this.a.a.e("/client_streamz/gnp_android/growthkit_event_logged", new imp("package_name", String.class), new imp("account_type", String.class), new imp("event_code", String.class));
                        e6.d();
                        return e6;
                    case 6:
                        imn c = this.a.a.c("/client_streamz/gnp_android/growthkit_event_processing_latency", new imp("package_name", String.class), new imp("cache_enabled", Boolean.class), new imp("optimized_flow", Boolean.class), new imp("promo_shown", Boolean.class));
                        c.d();
                        return c;
                    case 7:
                        imn c2 = this.a.a.c("/client_streamz/gnp_android/growthkit_event_queue_time", new imp("package_name", String.class), new imp("cache_enabled", Boolean.class), new imp("optimized_flow", Boolean.class), new imp("promo_shown", Boolean.class));
                        c2.d();
                        return c2;
                    case 8:
                        imn c3 = this.a.a.c("/client_streamz/gnp_android/push/decryption/latency", new imp("app_package_name", String.class), new imp("failure", Boolean.class), new imp("fetched_threads", Boolean.class));
                        c3.d();
                        return c3;
                    case 9:
                        imq e7 = this.a.a.e("/client_streamz/gnp_android/chime/chime_account_storage_facade/insert_account_to_both_storages_count", new imp("app_package_name", String.class), new imp("gnp_insertion_equals_chime", Boolean.class));
                        e7.d();
                        return e7;
                    case 10:
                        imq e8 = this.a.a.e("/client_streamz/gnp_android/chime/chime_account_storage_facade/remove_account_from_both_storages_count", new imp("app_package_name", String.class), new imp("gnp_removal_equals_chime", Boolean.class));
                        e8.d();
                        return e8;
                    case 11:
                        imq e9 = this.a.a.e("/client_streamz/gnp_android/chime/chime_account_storage_facade/update_account_on_both_storages_count", new imp("app_package_name", String.class), new imp("gnp_update_equals_chime", Boolean.class));
                        e9.d();
                        return e9;
                    case 12:
                        imq e10 = this.a.a.e("/client_streamz/gnp_android/tray_management/tray_instructions_processing_count", new imp("app_package_name", String.class), new imp("requested_tray_limit", Integer.class), new imp("above_tray_limit_count", Integer.class), new imp("requested_slot_limit", Integer.class), new imp("above_slot_limit_count", Integer.class));
                        e10.d();
                        return e10;
                    case 13:
                        imq e11 = this.a.a.e("/client_streamz/gnp_android/storage/chimegnp_storage_comparison", new imp("app_package_name", String.class), new imp("accounts_count_equal", Boolean.class), new imp("accounts_content_equal", Boolean.class), new imp("migration_performed", Boolean.class));
                        e11.d();
                        return e11;
                    case 14:
                        imq e12 = this.a.a.e("/client_streamz/chime_android/sdk/registration/request_builder_count", new imp("app_package_name", String.class), new imp("encryption_requested", Boolean.class), new imp("key_generation_result", Boolean.class));
                        e12.d();
                        return e12;
                    case 15:
                        imq e13 = this.a.a.e("/client_streamz/gnp_android/gnp/registration/multi_login_update_total_accounts_count", new imp("app_package_name", String.class), new imp("status", String.class));
                        e13.d();
                        return e13;
                    case 16:
                        imn c4 = this.a.a.c("/client_streamz/chime_android/push/decompression/latency", new imp("app_package_name", String.class), new imp("failure", Boolean.class));
                        c4.d();
                        return c4;
                    case 17:
                        imq e14 = this.a.a.e("/client_streamz/gnp_android/registration/registration_request_builder_count", new imp("app_package_name", String.class), new imp("encryption_requested", Boolean.class), new imp("key_generation_result", Boolean.class));
                        e14.d();
                        return e14;
                    case 18:
                        imq e15 = this.a.a.e("/client_streamz/gnp_android/job/chime_job_count", new imp("app_package_name", String.class), new imp("android_sdk_version", Integer.class), new imp("is_gnp_job", Boolean.class), new imp("job_key", String.class), new imp("executed_in_place", Boolean.class), new imp("result", String.class));
                        e15.d();
                        return e15;
                    case 19:
                        imq e16 = this.a.a.e("/client_streamz/gnp_android/registration/registration_request_count", new imp("app_package_name", String.class), new imp("registration_reason", String.class), new imp("status", String.class));
                        e16.d();
                        return e16;
                    default:
                        imq e17 = this.a.a.e("/client_streamz/gnp_android/job/input_builder_result_count", new imp("app_package_name", String.class), new imp("is_success", Boolean.class));
                        e17.d();
                        return e17;
                }
            }
        });
        final int i9 = 0;
        this.m = hwx.H(new jfe(this) { // from class: gve
            public final /* synthetic */ gvg a;

            {
                this.a = this;
            }

            @Override // defpackage.jfe
            public final Object a() {
                switch (i9) {
                    case 0:
                        imq e = this.a.a.e("/client_streamz/gnp_android/gnp/registration/multi_login_update_request_count", new imp("app_package_name", String.class), new imp("status", String.class));
                        e.d();
                        return e;
                    case 1:
                        imq e2 = this.a.a.e("/client_streamz/gnp_android/growthkit_impressions_count", new imp("package_name", String.class), new imp("user_action", String.class));
                        e2.d();
                        return e2;
                    case 2:
                        imq e3 = this.a.a.e("/client_streamz/gnp_android/growthkit_promotions_fetched", new imp("package_name", String.class), new imp("account_type", String.class));
                        e3.d();
                        return e3;
                    case 3:
                        imq e4 = this.a.a.e("/client_streamz/gnp_android/growthkit_network_library_count", new imp("package_name", String.class), new imp("network_library", String.class), new imp("status", String.class));
                        e4.d();
                        return e4;
                    case 4:
                        imq e5 = this.a.a.e("/client_streamz/gnp_android/push/decryption/request_count", new imp("app_package_name", String.class), new imp("failure", Boolean.class), new imp("has_placeholder", Boolean.class), new imp("fetched_threads", Boolean.class));
                        e5.d();
                        return e5;
                    case 5:
                        imq e6 = this.a.a.e("/client_streamz/gnp_android/growthkit_event_logged", new imp("package_name", String.class), new imp("account_type", String.class), new imp("event_code", String.class));
                        e6.d();
                        return e6;
                    case 6:
                        imn c = this.a.a.c("/client_streamz/gnp_android/growthkit_event_processing_latency", new imp("package_name", String.class), new imp("cache_enabled", Boolean.class), new imp("optimized_flow", Boolean.class), new imp("promo_shown", Boolean.class));
                        c.d();
                        return c;
                    case 7:
                        imn c2 = this.a.a.c("/client_streamz/gnp_android/growthkit_event_queue_time", new imp("package_name", String.class), new imp("cache_enabled", Boolean.class), new imp("optimized_flow", Boolean.class), new imp("promo_shown", Boolean.class));
                        c2.d();
                        return c2;
                    case 8:
                        imn c3 = this.a.a.c("/client_streamz/gnp_android/push/decryption/latency", new imp("app_package_name", String.class), new imp("failure", Boolean.class), new imp("fetched_threads", Boolean.class));
                        c3.d();
                        return c3;
                    case 9:
                        imq e7 = this.a.a.e("/client_streamz/gnp_android/chime/chime_account_storage_facade/insert_account_to_both_storages_count", new imp("app_package_name", String.class), new imp("gnp_insertion_equals_chime", Boolean.class));
                        e7.d();
                        return e7;
                    case 10:
                        imq e8 = this.a.a.e("/client_streamz/gnp_android/chime/chime_account_storage_facade/remove_account_from_both_storages_count", new imp("app_package_name", String.class), new imp("gnp_removal_equals_chime", Boolean.class));
                        e8.d();
                        return e8;
                    case 11:
                        imq e9 = this.a.a.e("/client_streamz/gnp_android/chime/chime_account_storage_facade/update_account_on_both_storages_count", new imp("app_package_name", String.class), new imp("gnp_update_equals_chime", Boolean.class));
                        e9.d();
                        return e9;
                    case 12:
                        imq e10 = this.a.a.e("/client_streamz/gnp_android/tray_management/tray_instructions_processing_count", new imp("app_package_name", String.class), new imp("requested_tray_limit", Integer.class), new imp("above_tray_limit_count", Integer.class), new imp("requested_slot_limit", Integer.class), new imp("above_slot_limit_count", Integer.class));
                        e10.d();
                        return e10;
                    case 13:
                        imq e11 = this.a.a.e("/client_streamz/gnp_android/storage/chimegnp_storage_comparison", new imp("app_package_name", String.class), new imp("accounts_count_equal", Boolean.class), new imp("accounts_content_equal", Boolean.class), new imp("migration_performed", Boolean.class));
                        e11.d();
                        return e11;
                    case 14:
                        imq e12 = this.a.a.e("/client_streamz/chime_android/sdk/registration/request_builder_count", new imp("app_package_name", String.class), new imp("encryption_requested", Boolean.class), new imp("key_generation_result", Boolean.class));
                        e12.d();
                        return e12;
                    case 15:
                        imq e13 = this.a.a.e("/client_streamz/gnp_android/gnp/registration/multi_login_update_total_accounts_count", new imp("app_package_name", String.class), new imp("status", String.class));
                        e13.d();
                        return e13;
                    case 16:
                        imn c4 = this.a.a.c("/client_streamz/chime_android/push/decompression/latency", new imp("app_package_name", String.class), new imp("failure", Boolean.class));
                        c4.d();
                        return c4;
                    case 17:
                        imq e14 = this.a.a.e("/client_streamz/gnp_android/registration/registration_request_builder_count", new imp("app_package_name", String.class), new imp("encryption_requested", Boolean.class), new imp("key_generation_result", Boolean.class));
                        e14.d();
                        return e14;
                    case 18:
                        imq e15 = this.a.a.e("/client_streamz/gnp_android/job/chime_job_count", new imp("app_package_name", String.class), new imp("android_sdk_version", Integer.class), new imp("is_gnp_job", Boolean.class), new imp("job_key", String.class), new imp("executed_in_place", Boolean.class), new imp("result", String.class));
                        e15.d();
                        return e15;
                    case 19:
                        imq e16 = this.a.a.e("/client_streamz/gnp_android/registration/registration_request_count", new imp("app_package_name", String.class), new imp("registration_reason", String.class), new imp("status", String.class));
                        e16.d();
                        return e16;
                    default:
                        imq e17 = this.a.a.e("/client_streamz/gnp_android/job/input_builder_result_count", new imp("app_package_name", String.class), new imp("is_success", Boolean.class));
                        e17.d();
                        return e17;
                }
            }
        });
        final int i10 = 12;
        this.f = hwx.H(new jfe(this) { // from class: gve
            public final /* synthetic */ gvg a;

            {
                this.a = this;
            }

            @Override // defpackage.jfe
            public final Object a() {
                switch (i10) {
                    case 0:
                        imq e = this.a.a.e("/client_streamz/gnp_android/gnp/registration/multi_login_update_request_count", new imp("app_package_name", String.class), new imp("status", String.class));
                        e.d();
                        return e;
                    case 1:
                        imq e2 = this.a.a.e("/client_streamz/gnp_android/growthkit_impressions_count", new imp("package_name", String.class), new imp("user_action", String.class));
                        e2.d();
                        return e2;
                    case 2:
                        imq e3 = this.a.a.e("/client_streamz/gnp_android/growthkit_promotions_fetched", new imp("package_name", String.class), new imp("account_type", String.class));
                        e3.d();
                        return e3;
                    case 3:
                        imq e4 = this.a.a.e("/client_streamz/gnp_android/growthkit_network_library_count", new imp("package_name", String.class), new imp("network_library", String.class), new imp("status", String.class));
                        e4.d();
                        return e4;
                    case 4:
                        imq e5 = this.a.a.e("/client_streamz/gnp_android/push/decryption/request_count", new imp("app_package_name", String.class), new imp("failure", Boolean.class), new imp("has_placeholder", Boolean.class), new imp("fetched_threads", Boolean.class));
                        e5.d();
                        return e5;
                    case 5:
                        imq e6 = this.a.a.e("/client_streamz/gnp_android/growthkit_event_logged", new imp("package_name", String.class), new imp("account_type", String.class), new imp("event_code", String.class));
                        e6.d();
                        return e6;
                    case 6:
                        imn c = this.a.a.c("/client_streamz/gnp_android/growthkit_event_processing_latency", new imp("package_name", String.class), new imp("cache_enabled", Boolean.class), new imp("optimized_flow", Boolean.class), new imp("promo_shown", Boolean.class));
                        c.d();
                        return c;
                    case 7:
                        imn c2 = this.a.a.c("/client_streamz/gnp_android/growthkit_event_queue_time", new imp("package_name", String.class), new imp("cache_enabled", Boolean.class), new imp("optimized_flow", Boolean.class), new imp("promo_shown", Boolean.class));
                        c2.d();
                        return c2;
                    case 8:
                        imn c3 = this.a.a.c("/client_streamz/gnp_android/push/decryption/latency", new imp("app_package_name", String.class), new imp("failure", Boolean.class), new imp("fetched_threads", Boolean.class));
                        c3.d();
                        return c3;
                    case 9:
                        imq e7 = this.a.a.e("/client_streamz/gnp_android/chime/chime_account_storage_facade/insert_account_to_both_storages_count", new imp("app_package_name", String.class), new imp("gnp_insertion_equals_chime", Boolean.class));
                        e7.d();
                        return e7;
                    case 10:
                        imq e8 = this.a.a.e("/client_streamz/gnp_android/chime/chime_account_storage_facade/remove_account_from_both_storages_count", new imp("app_package_name", String.class), new imp("gnp_removal_equals_chime", Boolean.class));
                        e8.d();
                        return e8;
                    case 11:
                        imq e9 = this.a.a.e("/client_streamz/gnp_android/chime/chime_account_storage_facade/update_account_on_both_storages_count", new imp("app_package_name", String.class), new imp("gnp_update_equals_chime", Boolean.class));
                        e9.d();
                        return e9;
                    case 12:
                        imq e10 = this.a.a.e("/client_streamz/gnp_android/tray_management/tray_instructions_processing_count", new imp("app_package_name", String.class), new imp("requested_tray_limit", Integer.class), new imp("above_tray_limit_count", Integer.class), new imp("requested_slot_limit", Integer.class), new imp("above_slot_limit_count", Integer.class));
                        e10.d();
                        return e10;
                    case 13:
                        imq e11 = this.a.a.e("/client_streamz/gnp_android/storage/chimegnp_storage_comparison", new imp("app_package_name", String.class), new imp("accounts_count_equal", Boolean.class), new imp("accounts_content_equal", Boolean.class), new imp("migration_performed", Boolean.class));
                        e11.d();
                        return e11;
                    case 14:
                        imq e12 = this.a.a.e("/client_streamz/chime_android/sdk/registration/request_builder_count", new imp("app_package_name", String.class), new imp("encryption_requested", Boolean.class), new imp("key_generation_result", Boolean.class));
                        e12.d();
                        return e12;
                    case 15:
                        imq e13 = this.a.a.e("/client_streamz/gnp_android/gnp/registration/multi_login_update_total_accounts_count", new imp("app_package_name", String.class), new imp("status", String.class));
                        e13.d();
                        return e13;
                    case 16:
                        imn c4 = this.a.a.c("/client_streamz/chime_android/push/decompression/latency", new imp("app_package_name", String.class), new imp("failure", Boolean.class));
                        c4.d();
                        return c4;
                    case 17:
                        imq e14 = this.a.a.e("/client_streamz/gnp_android/registration/registration_request_builder_count", new imp("app_package_name", String.class), new imp("encryption_requested", Boolean.class), new imp("key_generation_result", Boolean.class));
                        e14.d();
                        return e14;
                    case 18:
                        imq e15 = this.a.a.e("/client_streamz/gnp_android/job/chime_job_count", new imp("app_package_name", String.class), new imp("android_sdk_version", Integer.class), new imp("is_gnp_job", Boolean.class), new imp("job_key", String.class), new imp("executed_in_place", Boolean.class), new imp("result", String.class));
                        e15.d();
                        return e15;
                    case 19:
                        imq e16 = this.a.a.e("/client_streamz/gnp_android/registration/registration_request_count", new imp("app_package_name", String.class), new imp("registration_reason", String.class), new imp("status", String.class));
                        e16.d();
                        return e16;
                    default:
                        imq e17 = this.a.a.e("/client_streamz/gnp_android/job/input_builder_result_count", new imp("app_package_name", String.class), new imp("is_success", Boolean.class));
                        e17.d();
                        return e17;
                }
            }
        });
        final int i11 = 16;
        this.g = hwx.H(new jfe(this) { // from class: gve
            public final /* synthetic */ gvg a;

            {
                this.a = this;
            }

            @Override // defpackage.jfe
            public final Object a() {
                switch (i11) {
                    case 0:
                        imq e = this.a.a.e("/client_streamz/gnp_android/gnp/registration/multi_login_update_request_count", new imp("app_package_name", String.class), new imp("status", String.class));
                        e.d();
                        return e;
                    case 1:
                        imq e2 = this.a.a.e("/client_streamz/gnp_android/growthkit_impressions_count", new imp("package_name", String.class), new imp("user_action", String.class));
                        e2.d();
                        return e2;
                    case 2:
                        imq e3 = this.a.a.e("/client_streamz/gnp_android/growthkit_promotions_fetched", new imp("package_name", String.class), new imp("account_type", String.class));
                        e3.d();
                        return e3;
                    case 3:
                        imq e4 = this.a.a.e("/client_streamz/gnp_android/growthkit_network_library_count", new imp("package_name", String.class), new imp("network_library", String.class), new imp("status", String.class));
                        e4.d();
                        return e4;
                    case 4:
                        imq e5 = this.a.a.e("/client_streamz/gnp_android/push/decryption/request_count", new imp("app_package_name", String.class), new imp("failure", Boolean.class), new imp("has_placeholder", Boolean.class), new imp("fetched_threads", Boolean.class));
                        e5.d();
                        return e5;
                    case 5:
                        imq e6 = this.a.a.e("/client_streamz/gnp_android/growthkit_event_logged", new imp("package_name", String.class), new imp("account_type", String.class), new imp("event_code", String.class));
                        e6.d();
                        return e6;
                    case 6:
                        imn c = this.a.a.c("/client_streamz/gnp_android/growthkit_event_processing_latency", new imp("package_name", String.class), new imp("cache_enabled", Boolean.class), new imp("optimized_flow", Boolean.class), new imp("promo_shown", Boolean.class));
                        c.d();
                        return c;
                    case 7:
                        imn c2 = this.a.a.c("/client_streamz/gnp_android/growthkit_event_queue_time", new imp("package_name", String.class), new imp("cache_enabled", Boolean.class), new imp("optimized_flow", Boolean.class), new imp("promo_shown", Boolean.class));
                        c2.d();
                        return c2;
                    case 8:
                        imn c3 = this.a.a.c("/client_streamz/gnp_android/push/decryption/latency", new imp("app_package_name", String.class), new imp("failure", Boolean.class), new imp("fetched_threads", Boolean.class));
                        c3.d();
                        return c3;
                    case 9:
                        imq e7 = this.a.a.e("/client_streamz/gnp_android/chime/chime_account_storage_facade/insert_account_to_both_storages_count", new imp("app_package_name", String.class), new imp("gnp_insertion_equals_chime", Boolean.class));
                        e7.d();
                        return e7;
                    case 10:
                        imq e8 = this.a.a.e("/client_streamz/gnp_android/chime/chime_account_storage_facade/remove_account_from_both_storages_count", new imp("app_package_name", String.class), new imp("gnp_removal_equals_chime", Boolean.class));
                        e8.d();
                        return e8;
                    case 11:
                        imq e9 = this.a.a.e("/client_streamz/gnp_android/chime/chime_account_storage_facade/update_account_on_both_storages_count", new imp("app_package_name", String.class), new imp("gnp_update_equals_chime", Boolean.class));
                        e9.d();
                        return e9;
                    case 12:
                        imq e10 = this.a.a.e("/client_streamz/gnp_android/tray_management/tray_instructions_processing_count", new imp("app_package_name", String.class), new imp("requested_tray_limit", Integer.class), new imp("above_tray_limit_count", Integer.class), new imp("requested_slot_limit", Integer.class), new imp("above_slot_limit_count", Integer.class));
                        e10.d();
                        return e10;
                    case 13:
                        imq e11 = this.a.a.e("/client_streamz/gnp_android/storage/chimegnp_storage_comparison", new imp("app_package_name", String.class), new imp("accounts_count_equal", Boolean.class), new imp("accounts_content_equal", Boolean.class), new imp("migration_performed", Boolean.class));
                        e11.d();
                        return e11;
                    case 14:
                        imq e12 = this.a.a.e("/client_streamz/chime_android/sdk/registration/request_builder_count", new imp("app_package_name", String.class), new imp("encryption_requested", Boolean.class), new imp("key_generation_result", Boolean.class));
                        e12.d();
                        return e12;
                    case 15:
                        imq e13 = this.a.a.e("/client_streamz/gnp_android/gnp/registration/multi_login_update_total_accounts_count", new imp("app_package_name", String.class), new imp("status", String.class));
                        e13.d();
                        return e13;
                    case 16:
                        imn c4 = this.a.a.c("/client_streamz/chime_android/push/decompression/latency", new imp("app_package_name", String.class), new imp("failure", Boolean.class));
                        c4.d();
                        return c4;
                    case 17:
                        imq e14 = this.a.a.e("/client_streamz/gnp_android/registration/registration_request_builder_count", new imp("app_package_name", String.class), new imp("encryption_requested", Boolean.class), new imp("key_generation_result", Boolean.class));
                        e14.d();
                        return e14;
                    case 18:
                        imq e15 = this.a.a.e("/client_streamz/gnp_android/job/chime_job_count", new imp("app_package_name", String.class), new imp("android_sdk_version", Integer.class), new imp("is_gnp_job", Boolean.class), new imp("job_key", String.class), new imp("executed_in_place", Boolean.class), new imp("result", String.class));
                        e15.d();
                        return e15;
                    case 19:
                        imq e16 = this.a.a.e("/client_streamz/gnp_android/registration/registration_request_count", new imp("app_package_name", String.class), new imp("registration_reason", String.class), new imp("status", String.class));
                        e16.d();
                        return e16;
                    default:
                        imq e17 = this.a.a.e("/client_streamz/gnp_android/job/input_builder_result_count", new imp("app_package_name", String.class), new imp("is_success", Boolean.class));
                        e17.d();
                        return e17;
                }
            }
        });
        final int i12 = 17;
        this.h = hwx.H(new jfe(this) { // from class: gve
            public final /* synthetic */ gvg a;

            {
                this.a = this;
            }

            @Override // defpackage.jfe
            public final Object a() {
                switch (i12) {
                    case 0:
                        imq e = this.a.a.e("/client_streamz/gnp_android/gnp/registration/multi_login_update_request_count", new imp("app_package_name", String.class), new imp("status", String.class));
                        e.d();
                        return e;
                    case 1:
                        imq e2 = this.a.a.e("/client_streamz/gnp_android/growthkit_impressions_count", new imp("package_name", String.class), new imp("user_action", String.class));
                        e2.d();
                        return e2;
                    case 2:
                        imq e3 = this.a.a.e("/client_streamz/gnp_android/growthkit_promotions_fetched", new imp("package_name", String.class), new imp("account_type", String.class));
                        e3.d();
                        return e3;
                    case 3:
                        imq e4 = this.a.a.e("/client_streamz/gnp_android/growthkit_network_library_count", new imp("package_name", String.class), new imp("network_library", String.class), new imp("status", String.class));
                        e4.d();
                        return e4;
                    case 4:
                        imq e5 = this.a.a.e("/client_streamz/gnp_android/push/decryption/request_count", new imp("app_package_name", String.class), new imp("failure", Boolean.class), new imp("has_placeholder", Boolean.class), new imp("fetched_threads", Boolean.class));
                        e5.d();
                        return e5;
                    case 5:
                        imq e6 = this.a.a.e("/client_streamz/gnp_android/growthkit_event_logged", new imp("package_name", String.class), new imp("account_type", String.class), new imp("event_code", String.class));
                        e6.d();
                        return e6;
                    case 6:
                        imn c = this.a.a.c("/client_streamz/gnp_android/growthkit_event_processing_latency", new imp("package_name", String.class), new imp("cache_enabled", Boolean.class), new imp("optimized_flow", Boolean.class), new imp("promo_shown", Boolean.class));
                        c.d();
                        return c;
                    case 7:
                        imn c2 = this.a.a.c("/client_streamz/gnp_android/growthkit_event_queue_time", new imp("package_name", String.class), new imp("cache_enabled", Boolean.class), new imp("optimized_flow", Boolean.class), new imp("promo_shown", Boolean.class));
                        c2.d();
                        return c2;
                    case 8:
                        imn c3 = this.a.a.c("/client_streamz/gnp_android/push/decryption/latency", new imp("app_package_name", String.class), new imp("failure", Boolean.class), new imp("fetched_threads", Boolean.class));
                        c3.d();
                        return c3;
                    case 9:
                        imq e7 = this.a.a.e("/client_streamz/gnp_android/chime/chime_account_storage_facade/insert_account_to_both_storages_count", new imp("app_package_name", String.class), new imp("gnp_insertion_equals_chime", Boolean.class));
                        e7.d();
                        return e7;
                    case 10:
                        imq e8 = this.a.a.e("/client_streamz/gnp_android/chime/chime_account_storage_facade/remove_account_from_both_storages_count", new imp("app_package_name", String.class), new imp("gnp_removal_equals_chime", Boolean.class));
                        e8.d();
                        return e8;
                    case 11:
                        imq e9 = this.a.a.e("/client_streamz/gnp_android/chime/chime_account_storage_facade/update_account_on_both_storages_count", new imp("app_package_name", String.class), new imp("gnp_update_equals_chime", Boolean.class));
                        e9.d();
                        return e9;
                    case 12:
                        imq e10 = this.a.a.e("/client_streamz/gnp_android/tray_management/tray_instructions_processing_count", new imp("app_package_name", String.class), new imp("requested_tray_limit", Integer.class), new imp("above_tray_limit_count", Integer.class), new imp("requested_slot_limit", Integer.class), new imp("above_slot_limit_count", Integer.class));
                        e10.d();
                        return e10;
                    case 13:
                        imq e11 = this.a.a.e("/client_streamz/gnp_android/storage/chimegnp_storage_comparison", new imp("app_package_name", String.class), new imp("accounts_count_equal", Boolean.class), new imp("accounts_content_equal", Boolean.class), new imp("migration_performed", Boolean.class));
                        e11.d();
                        return e11;
                    case 14:
                        imq e12 = this.a.a.e("/client_streamz/chime_android/sdk/registration/request_builder_count", new imp("app_package_name", String.class), new imp("encryption_requested", Boolean.class), new imp("key_generation_result", Boolean.class));
                        e12.d();
                        return e12;
                    case 15:
                        imq e13 = this.a.a.e("/client_streamz/gnp_android/gnp/registration/multi_login_update_total_accounts_count", new imp("app_package_name", String.class), new imp("status", String.class));
                        e13.d();
                        return e13;
                    case 16:
                        imn c4 = this.a.a.c("/client_streamz/chime_android/push/decompression/latency", new imp("app_package_name", String.class), new imp("failure", Boolean.class));
                        c4.d();
                        return c4;
                    case 17:
                        imq e14 = this.a.a.e("/client_streamz/gnp_android/registration/registration_request_builder_count", new imp("app_package_name", String.class), new imp("encryption_requested", Boolean.class), new imp("key_generation_result", Boolean.class));
                        e14.d();
                        return e14;
                    case 18:
                        imq e15 = this.a.a.e("/client_streamz/gnp_android/job/chime_job_count", new imp("app_package_name", String.class), new imp("android_sdk_version", Integer.class), new imp("is_gnp_job", Boolean.class), new imp("job_key", String.class), new imp("executed_in_place", Boolean.class), new imp("result", String.class));
                        e15.d();
                        return e15;
                    case 19:
                        imq e16 = this.a.a.e("/client_streamz/gnp_android/registration/registration_request_count", new imp("app_package_name", String.class), new imp("registration_reason", String.class), new imp("status", String.class));
                        e16.d();
                        return e16;
                    default:
                        imq e17 = this.a.a.e("/client_streamz/gnp_android/job/input_builder_result_count", new imp("app_package_name", String.class), new imp("is_success", Boolean.class));
                        e17.d();
                        return e17;
                }
            }
        });
        final int i13 = 18;
        this.n = hwx.H(new jfe(this) { // from class: gve
            public final /* synthetic */ gvg a;

            {
                this.a = this;
            }

            @Override // defpackage.jfe
            public final Object a() {
                switch (i13) {
                    case 0:
                        imq e = this.a.a.e("/client_streamz/gnp_android/gnp/registration/multi_login_update_request_count", new imp("app_package_name", String.class), new imp("status", String.class));
                        e.d();
                        return e;
                    case 1:
                        imq e2 = this.a.a.e("/client_streamz/gnp_android/growthkit_impressions_count", new imp("package_name", String.class), new imp("user_action", String.class));
                        e2.d();
                        return e2;
                    case 2:
                        imq e3 = this.a.a.e("/client_streamz/gnp_android/growthkit_promotions_fetched", new imp("package_name", String.class), new imp("account_type", String.class));
                        e3.d();
                        return e3;
                    case 3:
                        imq e4 = this.a.a.e("/client_streamz/gnp_android/growthkit_network_library_count", new imp("package_name", String.class), new imp("network_library", String.class), new imp("status", String.class));
                        e4.d();
                        return e4;
                    case 4:
                        imq e5 = this.a.a.e("/client_streamz/gnp_android/push/decryption/request_count", new imp("app_package_name", String.class), new imp("failure", Boolean.class), new imp("has_placeholder", Boolean.class), new imp("fetched_threads", Boolean.class));
                        e5.d();
                        return e5;
                    case 5:
                        imq e6 = this.a.a.e("/client_streamz/gnp_android/growthkit_event_logged", new imp("package_name", String.class), new imp("account_type", String.class), new imp("event_code", String.class));
                        e6.d();
                        return e6;
                    case 6:
                        imn c = this.a.a.c("/client_streamz/gnp_android/growthkit_event_processing_latency", new imp("package_name", String.class), new imp("cache_enabled", Boolean.class), new imp("optimized_flow", Boolean.class), new imp("promo_shown", Boolean.class));
                        c.d();
                        return c;
                    case 7:
                        imn c2 = this.a.a.c("/client_streamz/gnp_android/growthkit_event_queue_time", new imp("package_name", String.class), new imp("cache_enabled", Boolean.class), new imp("optimized_flow", Boolean.class), new imp("promo_shown", Boolean.class));
                        c2.d();
                        return c2;
                    case 8:
                        imn c3 = this.a.a.c("/client_streamz/gnp_android/push/decryption/latency", new imp("app_package_name", String.class), new imp("failure", Boolean.class), new imp("fetched_threads", Boolean.class));
                        c3.d();
                        return c3;
                    case 9:
                        imq e7 = this.a.a.e("/client_streamz/gnp_android/chime/chime_account_storage_facade/insert_account_to_both_storages_count", new imp("app_package_name", String.class), new imp("gnp_insertion_equals_chime", Boolean.class));
                        e7.d();
                        return e7;
                    case 10:
                        imq e8 = this.a.a.e("/client_streamz/gnp_android/chime/chime_account_storage_facade/remove_account_from_both_storages_count", new imp("app_package_name", String.class), new imp("gnp_removal_equals_chime", Boolean.class));
                        e8.d();
                        return e8;
                    case 11:
                        imq e9 = this.a.a.e("/client_streamz/gnp_android/chime/chime_account_storage_facade/update_account_on_both_storages_count", new imp("app_package_name", String.class), new imp("gnp_update_equals_chime", Boolean.class));
                        e9.d();
                        return e9;
                    case 12:
                        imq e10 = this.a.a.e("/client_streamz/gnp_android/tray_management/tray_instructions_processing_count", new imp("app_package_name", String.class), new imp("requested_tray_limit", Integer.class), new imp("above_tray_limit_count", Integer.class), new imp("requested_slot_limit", Integer.class), new imp("above_slot_limit_count", Integer.class));
                        e10.d();
                        return e10;
                    case 13:
                        imq e11 = this.a.a.e("/client_streamz/gnp_android/storage/chimegnp_storage_comparison", new imp("app_package_name", String.class), new imp("accounts_count_equal", Boolean.class), new imp("accounts_content_equal", Boolean.class), new imp("migration_performed", Boolean.class));
                        e11.d();
                        return e11;
                    case 14:
                        imq e12 = this.a.a.e("/client_streamz/chime_android/sdk/registration/request_builder_count", new imp("app_package_name", String.class), new imp("encryption_requested", Boolean.class), new imp("key_generation_result", Boolean.class));
                        e12.d();
                        return e12;
                    case 15:
                        imq e13 = this.a.a.e("/client_streamz/gnp_android/gnp/registration/multi_login_update_total_accounts_count", new imp("app_package_name", String.class), new imp("status", String.class));
                        e13.d();
                        return e13;
                    case 16:
                        imn c4 = this.a.a.c("/client_streamz/chime_android/push/decompression/latency", new imp("app_package_name", String.class), new imp("failure", Boolean.class));
                        c4.d();
                        return c4;
                    case 17:
                        imq e14 = this.a.a.e("/client_streamz/gnp_android/registration/registration_request_builder_count", new imp("app_package_name", String.class), new imp("encryption_requested", Boolean.class), new imp("key_generation_result", Boolean.class));
                        e14.d();
                        return e14;
                    case 18:
                        imq e15 = this.a.a.e("/client_streamz/gnp_android/job/chime_job_count", new imp("app_package_name", String.class), new imp("android_sdk_version", Integer.class), new imp("is_gnp_job", Boolean.class), new imp("job_key", String.class), new imp("executed_in_place", Boolean.class), new imp("result", String.class));
                        e15.d();
                        return e15;
                    case 19:
                        imq e16 = this.a.a.e("/client_streamz/gnp_android/registration/registration_request_count", new imp("app_package_name", String.class), new imp("registration_reason", String.class), new imp("status", String.class));
                        e16.d();
                        return e16;
                    default:
                        imq e17 = this.a.a.e("/client_streamz/gnp_android/job/input_builder_result_count", new imp("app_package_name", String.class), new imp("is_success", Boolean.class));
                        e17.d();
                        return e17;
                }
            }
        });
        final int i14 = 19;
        this.i = hwx.H(new jfe(this) { // from class: gve
            public final /* synthetic */ gvg a;

            {
                this.a = this;
            }

            @Override // defpackage.jfe
            public final Object a() {
                switch (i14) {
                    case 0:
                        imq e = this.a.a.e("/client_streamz/gnp_android/gnp/registration/multi_login_update_request_count", new imp("app_package_name", String.class), new imp("status", String.class));
                        e.d();
                        return e;
                    case 1:
                        imq e2 = this.a.a.e("/client_streamz/gnp_android/growthkit_impressions_count", new imp("package_name", String.class), new imp("user_action", String.class));
                        e2.d();
                        return e2;
                    case 2:
                        imq e3 = this.a.a.e("/client_streamz/gnp_android/growthkit_promotions_fetched", new imp("package_name", String.class), new imp("account_type", String.class));
                        e3.d();
                        return e3;
                    case 3:
                        imq e4 = this.a.a.e("/client_streamz/gnp_android/growthkit_network_library_count", new imp("package_name", String.class), new imp("network_library", String.class), new imp("status", String.class));
                        e4.d();
                        return e4;
                    case 4:
                        imq e5 = this.a.a.e("/client_streamz/gnp_android/push/decryption/request_count", new imp("app_package_name", String.class), new imp("failure", Boolean.class), new imp("has_placeholder", Boolean.class), new imp("fetched_threads", Boolean.class));
                        e5.d();
                        return e5;
                    case 5:
                        imq e6 = this.a.a.e("/client_streamz/gnp_android/growthkit_event_logged", new imp("package_name", String.class), new imp("account_type", String.class), new imp("event_code", String.class));
                        e6.d();
                        return e6;
                    case 6:
                        imn c = this.a.a.c("/client_streamz/gnp_android/growthkit_event_processing_latency", new imp("package_name", String.class), new imp("cache_enabled", Boolean.class), new imp("optimized_flow", Boolean.class), new imp("promo_shown", Boolean.class));
                        c.d();
                        return c;
                    case 7:
                        imn c2 = this.a.a.c("/client_streamz/gnp_android/growthkit_event_queue_time", new imp("package_name", String.class), new imp("cache_enabled", Boolean.class), new imp("optimized_flow", Boolean.class), new imp("promo_shown", Boolean.class));
                        c2.d();
                        return c2;
                    case 8:
                        imn c3 = this.a.a.c("/client_streamz/gnp_android/push/decryption/latency", new imp("app_package_name", String.class), new imp("failure", Boolean.class), new imp("fetched_threads", Boolean.class));
                        c3.d();
                        return c3;
                    case 9:
                        imq e7 = this.a.a.e("/client_streamz/gnp_android/chime/chime_account_storage_facade/insert_account_to_both_storages_count", new imp("app_package_name", String.class), new imp("gnp_insertion_equals_chime", Boolean.class));
                        e7.d();
                        return e7;
                    case 10:
                        imq e8 = this.a.a.e("/client_streamz/gnp_android/chime/chime_account_storage_facade/remove_account_from_both_storages_count", new imp("app_package_name", String.class), new imp("gnp_removal_equals_chime", Boolean.class));
                        e8.d();
                        return e8;
                    case 11:
                        imq e9 = this.a.a.e("/client_streamz/gnp_android/chime/chime_account_storage_facade/update_account_on_both_storages_count", new imp("app_package_name", String.class), new imp("gnp_update_equals_chime", Boolean.class));
                        e9.d();
                        return e9;
                    case 12:
                        imq e10 = this.a.a.e("/client_streamz/gnp_android/tray_management/tray_instructions_processing_count", new imp("app_package_name", String.class), new imp("requested_tray_limit", Integer.class), new imp("above_tray_limit_count", Integer.class), new imp("requested_slot_limit", Integer.class), new imp("above_slot_limit_count", Integer.class));
                        e10.d();
                        return e10;
                    case 13:
                        imq e11 = this.a.a.e("/client_streamz/gnp_android/storage/chimegnp_storage_comparison", new imp("app_package_name", String.class), new imp("accounts_count_equal", Boolean.class), new imp("accounts_content_equal", Boolean.class), new imp("migration_performed", Boolean.class));
                        e11.d();
                        return e11;
                    case 14:
                        imq e12 = this.a.a.e("/client_streamz/chime_android/sdk/registration/request_builder_count", new imp("app_package_name", String.class), new imp("encryption_requested", Boolean.class), new imp("key_generation_result", Boolean.class));
                        e12.d();
                        return e12;
                    case 15:
                        imq e13 = this.a.a.e("/client_streamz/gnp_android/gnp/registration/multi_login_update_total_accounts_count", new imp("app_package_name", String.class), new imp("status", String.class));
                        e13.d();
                        return e13;
                    case 16:
                        imn c4 = this.a.a.c("/client_streamz/chime_android/push/decompression/latency", new imp("app_package_name", String.class), new imp("failure", Boolean.class));
                        c4.d();
                        return c4;
                    case 17:
                        imq e14 = this.a.a.e("/client_streamz/gnp_android/registration/registration_request_builder_count", new imp("app_package_name", String.class), new imp("encryption_requested", Boolean.class), new imp("key_generation_result", Boolean.class));
                        e14.d();
                        return e14;
                    case 18:
                        imq e15 = this.a.a.e("/client_streamz/gnp_android/job/chime_job_count", new imp("app_package_name", String.class), new imp("android_sdk_version", Integer.class), new imp("is_gnp_job", Boolean.class), new imp("job_key", String.class), new imp("executed_in_place", Boolean.class), new imp("result", String.class));
                        e15.d();
                        return e15;
                    case 19:
                        imq e16 = this.a.a.e("/client_streamz/gnp_android/registration/registration_request_count", new imp("app_package_name", String.class), new imp("registration_reason", String.class), new imp("status", String.class));
                        e16.d();
                        return e16;
                    default:
                        imq e17 = this.a.a.e("/client_streamz/gnp_android/job/input_builder_result_count", new imp("app_package_name", String.class), new imp("is_success", Boolean.class));
                        e17.d();
                        return e17;
                }
            }
        });
        final int i15 = 20;
        this.o = hwx.H(new jfe(this) { // from class: gve
            public final /* synthetic */ gvg a;

            {
                this.a = this;
            }

            @Override // defpackage.jfe
            public final Object a() {
                switch (i15) {
                    case 0:
                        imq e = this.a.a.e("/client_streamz/gnp_android/gnp/registration/multi_login_update_request_count", new imp("app_package_name", String.class), new imp("status", String.class));
                        e.d();
                        return e;
                    case 1:
                        imq e2 = this.a.a.e("/client_streamz/gnp_android/growthkit_impressions_count", new imp("package_name", String.class), new imp("user_action", String.class));
                        e2.d();
                        return e2;
                    case 2:
                        imq e3 = this.a.a.e("/client_streamz/gnp_android/growthkit_promotions_fetched", new imp("package_name", String.class), new imp("account_type", String.class));
                        e3.d();
                        return e3;
                    case 3:
                        imq e4 = this.a.a.e("/client_streamz/gnp_android/growthkit_network_library_count", new imp("package_name", String.class), new imp("network_library", String.class), new imp("status", String.class));
                        e4.d();
                        return e4;
                    case 4:
                        imq e5 = this.a.a.e("/client_streamz/gnp_android/push/decryption/request_count", new imp("app_package_name", String.class), new imp("failure", Boolean.class), new imp("has_placeholder", Boolean.class), new imp("fetched_threads", Boolean.class));
                        e5.d();
                        return e5;
                    case 5:
                        imq e6 = this.a.a.e("/client_streamz/gnp_android/growthkit_event_logged", new imp("package_name", String.class), new imp("account_type", String.class), new imp("event_code", String.class));
                        e6.d();
                        return e6;
                    case 6:
                        imn c = this.a.a.c("/client_streamz/gnp_android/growthkit_event_processing_latency", new imp("package_name", String.class), new imp("cache_enabled", Boolean.class), new imp("optimized_flow", Boolean.class), new imp("promo_shown", Boolean.class));
                        c.d();
                        return c;
                    case 7:
                        imn c2 = this.a.a.c("/client_streamz/gnp_android/growthkit_event_queue_time", new imp("package_name", String.class), new imp("cache_enabled", Boolean.class), new imp("optimized_flow", Boolean.class), new imp("promo_shown", Boolean.class));
                        c2.d();
                        return c2;
                    case 8:
                        imn c3 = this.a.a.c("/client_streamz/gnp_android/push/decryption/latency", new imp("app_package_name", String.class), new imp("failure", Boolean.class), new imp("fetched_threads", Boolean.class));
                        c3.d();
                        return c3;
                    case 9:
                        imq e7 = this.a.a.e("/client_streamz/gnp_android/chime/chime_account_storage_facade/insert_account_to_both_storages_count", new imp("app_package_name", String.class), new imp("gnp_insertion_equals_chime", Boolean.class));
                        e7.d();
                        return e7;
                    case 10:
                        imq e8 = this.a.a.e("/client_streamz/gnp_android/chime/chime_account_storage_facade/remove_account_from_both_storages_count", new imp("app_package_name", String.class), new imp("gnp_removal_equals_chime", Boolean.class));
                        e8.d();
                        return e8;
                    case 11:
                        imq e9 = this.a.a.e("/client_streamz/gnp_android/chime/chime_account_storage_facade/update_account_on_both_storages_count", new imp("app_package_name", String.class), new imp("gnp_update_equals_chime", Boolean.class));
                        e9.d();
                        return e9;
                    case 12:
                        imq e10 = this.a.a.e("/client_streamz/gnp_android/tray_management/tray_instructions_processing_count", new imp("app_package_name", String.class), new imp("requested_tray_limit", Integer.class), new imp("above_tray_limit_count", Integer.class), new imp("requested_slot_limit", Integer.class), new imp("above_slot_limit_count", Integer.class));
                        e10.d();
                        return e10;
                    case 13:
                        imq e11 = this.a.a.e("/client_streamz/gnp_android/storage/chimegnp_storage_comparison", new imp("app_package_name", String.class), new imp("accounts_count_equal", Boolean.class), new imp("accounts_content_equal", Boolean.class), new imp("migration_performed", Boolean.class));
                        e11.d();
                        return e11;
                    case 14:
                        imq e12 = this.a.a.e("/client_streamz/chime_android/sdk/registration/request_builder_count", new imp("app_package_name", String.class), new imp("encryption_requested", Boolean.class), new imp("key_generation_result", Boolean.class));
                        e12.d();
                        return e12;
                    case 15:
                        imq e13 = this.a.a.e("/client_streamz/gnp_android/gnp/registration/multi_login_update_total_accounts_count", new imp("app_package_name", String.class), new imp("status", String.class));
                        e13.d();
                        return e13;
                    case 16:
                        imn c4 = this.a.a.c("/client_streamz/chime_android/push/decompression/latency", new imp("app_package_name", String.class), new imp("failure", Boolean.class));
                        c4.d();
                        return c4;
                    case 17:
                        imq e14 = this.a.a.e("/client_streamz/gnp_android/registration/registration_request_builder_count", new imp("app_package_name", String.class), new imp("encryption_requested", Boolean.class), new imp("key_generation_result", Boolean.class));
                        e14.d();
                        return e14;
                    case 18:
                        imq e15 = this.a.a.e("/client_streamz/gnp_android/job/chime_job_count", new imp("app_package_name", String.class), new imp("android_sdk_version", Integer.class), new imp("is_gnp_job", Boolean.class), new imp("job_key", String.class), new imp("executed_in_place", Boolean.class), new imp("result", String.class));
                        e15.d();
                        return e15;
                    case 19:
                        imq e16 = this.a.a.e("/client_streamz/gnp_android/registration/registration_request_count", new imp("app_package_name", String.class), new imp("registration_reason", String.class), new imp("status", String.class));
                        e16.d();
                        return e16;
                    default:
                        imq e17 = this.a.a.e("/client_streamz/gnp_android/job/input_builder_result_count", new imp("app_package_name", String.class), new imp("is_success", Boolean.class));
                        e17.d();
                        return e17;
                }
            }
        });
        final int i16 = 1;
        hwx.H(new gvf(this, i16));
        hwx.H(new gvf(this, i9));
        hwx.H(new enj(this, i10));
        hwx.H(new enj(this, i7));
        hwx.H(new enj(this, i8));
        hwx.H(new enj(this, i11));
        hwx.H(new enj(this, i12));
        hwx.H(new enj(this, i13));
        hwx.H(new enj(this, i14));
        hwx.H(new enj(this, i15));
        hwx.H(new jfe(this) { // from class: gve
            public final /* synthetic */ gvg a;

            {
                this.a = this;
            }

            @Override // defpackage.jfe
            public final Object a() {
                switch (i16) {
                    case 0:
                        imq e = this.a.a.e("/client_streamz/gnp_android/gnp/registration/multi_login_update_request_count", new imp("app_package_name", String.class), new imp("status", String.class));
                        e.d();
                        return e;
                    case 1:
                        imq e2 = this.a.a.e("/client_streamz/gnp_android/growthkit_impressions_count", new imp("package_name", String.class), new imp("user_action", String.class));
                        e2.d();
                        return e2;
                    case 2:
                        imq e3 = this.a.a.e("/client_streamz/gnp_android/growthkit_promotions_fetched", new imp("package_name", String.class), new imp("account_type", String.class));
                        e3.d();
                        return e3;
                    case 3:
                        imq e4 = this.a.a.e("/client_streamz/gnp_android/growthkit_network_library_count", new imp("package_name", String.class), new imp("network_library", String.class), new imp("status", String.class));
                        e4.d();
                        return e4;
                    case 4:
                        imq e5 = this.a.a.e("/client_streamz/gnp_android/push/decryption/request_count", new imp("app_package_name", String.class), new imp("failure", Boolean.class), new imp("has_placeholder", Boolean.class), new imp("fetched_threads", Boolean.class));
                        e5.d();
                        return e5;
                    case 5:
                        imq e6 = this.a.a.e("/client_streamz/gnp_android/growthkit_event_logged", new imp("package_name", String.class), new imp("account_type", String.class), new imp("event_code", String.class));
                        e6.d();
                        return e6;
                    case 6:
                        imn c = this.a.a.c("/client_streamz/gnp_android/growthkit_event_processing_latency", new imp("package_name", String.class), new imp("cache_enabled", Boolean.class), new imp("optimized_flow", Boolean.class), new imp("promo_shown", Boolean.class));
                        c.d();
                        return c;
                    case 7:
                        imn c2 = this.a.a.c("/client_streamz/gnp_android/growthkit_event_queue_time", new imp("package_name", String.class), new imp("cache_enabled", Boolean.class), new imp("optimized_flow", Boolean.class), new imp("promo_shown", Boolean.class));
                        c2.d();
                        return c2;
                    case 8:
                        imn c3 = this.a.a.c("/client_streamz/gnp_android/push/decryption/latency", new imp("app_package_name", String.class), new imp("failure", Boolean.class), new imp("fetched_threads", Boolean.class));
                        c3.d();
                        return c3;
                    case 9:
                        imq e7 = this.a.a.e("/client_streamz/gnp_android/chime/chime_account_storage_facade/insert_account_to_both_storages_count", new imp("app_package_name", String.class), new imp("gnp_insertion_equals_chime", Boolean.class));
                        e7.d();
                        return e7;
                    case 10:
                        imq e8 = this.a.a.e("/client_streamz/gnp_android/chime/chime_account_storage_facade/remove_account_from_both_storages_count", new imp("app_package_name", String.class), new imp("gnp_removal_equals_chime", Boolean.class));
                        e8.d();
                        return e8;
                    case 11:
                        imq e9 = this.a.a.e("/client_streamz/gnp_android/chime/chime_account_storage_facade/update_account_on_both_storages_count", new imp("app_package_name", String.class), new imp("gnp_update_equals_chime", Boolean.class));
                        e9.d();
                        return e9;
                    case 12:
                        imq e10 = this.a.a.e("/client_streamz/gnp_android/tray_management/tray_instructions_processing_count", new imp("app_package_name", String.class), new imp("requested_tray_limit", Integer.class), new imp("above_tray_limit_count", Integer.class), new imp("requested_slot_limit", Integer.class), new imp("above_slot_limit_count", Integer.class));
                        e10.d();
                        return e10;
                    case 13:
                        imq e11 = this.a.a.e("/client_streamz/gnp_android/storage/chimegnp_storage_comparison", new imp("app_package_name", String.class), new imp("accounts_count_equal", Boolean.class), new imp("accounts_content_equal", Boolean.class), new imp("migration_performed", Boolean.class));
                        e11.d();
                        return e11;
                    case 14:
                        imq e12 = this.a.a.e("/client_streamz/chime_android/sdk/registration/request_builder_count", new imp("app_package_name", String.class), new imp("encryption_requested", Boolean.class), new imp("key_generation_result", Boolean.class));
                        e12.d();
                        return e12;
                    case 15:
                        imq e13 = this.a.a.e("/client_streamz/gnp_android/gnp/registration/multi_login_update_total_accounts_count", new imp("app_package_name", String.class), new imp("status", String.class));
                        e13.d();
                        return e13;
                    case 16:
                        imn c4 = this.a.a.c("/client_streamz/chime_android/push/decompression/latency", new imp("app_package_name", String.class), new imp("failure", Boolean.class));
                        c4.d();
                        return c4;
                    case 17:
                        imq e14 = this.a.a.e("/client_streamz/gnp_android/registration/registration_request_builder_count", new imp("app_package_name", String.class), new imp("encryption_requested", Boolean.class), new imp("key_generation_result", Boolean.class));
                        e14.d();
                        return e14;
                    case 18:
                        imq e15 = this.a.a.e("/client_streamz/gnp_android/job/chime_job_count", new imp("app_package_name", String.class), new imp("android_sdk_version", Integer.class), new imp("is_gnp_job", Boolean.class), new imp("job_key", String.class), new imp("executed_in_place", Boolean.class), new imp("result", String.class));
                        e15.d();
                        return e15;
                    case 19:
                        imq e16 = this.a.a.e("/client_streamz/gnp_android/registration/registration_request_count", new imp("app_package_name", String.class), new imp("registration_reason", String.class), new imp("status", String.class));
                        e16.d();
                        return e16;
                    default:
                        imq e17 = this.a.a.e("/client_streamz/gnp_android/job/input_builder_result_count", new imp("app_package_name", String.class), new imp("is_success", Boolean.class));
                        e17.d();
                        return e17;
                }
            }
        });
        final int i17 = 2;
        hwx.H(new jfe(this) { // from class: gve
            public final /* synthetic */ gvg a;

            {
                this.a = this;
            }

            @Override // defpackage.jfe
            public final Object a() {
                switch (i17) {
                    case 0:
                        imq e = this.a.a.e("/client_streamz/gnp_android/gnp/registration/multi_login_update_request_count", new imp("app_package_name", String.class), new imp("status", String.class));
                        e.d();
                        return e;
                    case 1:
                        imq e2 = this.a.a.e("/client_streamz/gnp_android/growthkit_impressions_count", new imp("package_name", String.class), new imp("user_action", String.class));
                        e2.d();
                        return e2;
                    case 2:
                        imq e3 = this.a.a.e("/client_streamz/gnp_android/growthkit_promotions_fetched", new imp("package_name", String.class), new imp("account_type", String.class));
                        e3.d();
                        return e3;
                    case 3:
                        imq e4 = this.a.a.e("/client_streamz/gnp_android/growthkit_network_library_count", new imp("package_name", String.class), new imp("network_library", String.class), new imp("status", String.class));
                        e4.d();
                        return e4;
                    case 4:
                        imq e5 = this.a.a.e("/client_streamz/gnp_android/push/decryption/request_count", new imp("app_package_name", String.class), new imp("failure", Boolean.class), new imp("has_placeholder", Boolean.class), new imp("fetched_threads", Boolean.class));
                        e5.d();
                        return e5;
                    case 5:
                        imq e6 = this.a.a.e("/client_streamz/gnp_android/growthkit_event_logged", new imp("package_name", String.class), new imp("account_type", String.class), new imp("event_code", String.class));
                        e6.d();
                        return e6;
                    case 6:
                        imn c = this.a.a.c("/client_streamz/gnp_android/growthkit_event_processing_latency", new imp("package_name", String.class), new imp("cache_enabled", Boolean.class), new imp("optimized_flow", Boolean.class), new imp("promo_shown", Boolean.class));
                        c.d();
                        return c;
                    case 7:
                        imn c2 = this.a.a.c("/client_streamz/gnp_android/growthkit_event_queue_time", new imp("package_name", String.class), new imp("cache_enabled", Boolean.class), new imp("optimized_flow", Boolean.class), new imp("promo_shown", Boolean.class));
                        c2.d();
                        return c2;
                    case 8:
                        imn c3 = this.a.a.c("/client_streamz/gnp_android/push/decryption/latency", new imp("app_package_name", String.class), new imp("failure", Boolean.class), new imp("fetched_threads", Boolean.class));
                        c3.d();
                        return c3;
                    case 9:
                        imq e7 = this.a.a.e("/client_streamz/gnp_android/chime/chime_account_storage_facade/insert_account_to_both_storages_count", new imp("app_package_name", String.class), new imp("gnp_insertion_equals_chime", Boolean.class));
                        e7.d();
                        return e7;
                    case 10:
                        imq e8 = this.a.a.e("/client_streamz/gnp_android/chime/chime_account_storage_facade/remove_account_from_both_storages_count", new imp("app_package_name", String.class), new imp("gnp_removal_equals_chime", Boolean.class));
                        e8.d();
                        return e8;
                    case 11:
                        imq e9 = this.a.a.e("/client_streamz/gnp_android/chime/chime_account_storage_facade/update_account_on_both_storages_count", new imp("app_package_name", String.class), new imp("gnp_update_equals_chime", Boolean.class));
                        e9.d();
                        return e9;
                    case 12:
                        imq e10 = this.a.a.e("/client_streamz/gnp_android/tray_management/tray_instructions_processing_count", new imp("app_package_name", String.class), new imp("requested_tray_limit", Integer.class), new imp("above_tray_limit_count", Integer.class), new imp("requested_slot_limit", Integer.class), new imp("above_slot_limit_count", Integer.class));
                        e10.d();
                        return e10;
                    case 13:
                        imq e11 = this.a.a.e("/client_streamz/gnp_android/storage/chimegnp_storage_comparison", new imp("app_package_name", String.class), new imp("accounts_count_equal", Boolean.class), new imp("accounts_content_equal", Boolean.class), new imp("migration_performed", Boolean.class));
                        e11.d();
                        return e11;
                    case 14:
                        imq e12 = this.a.a.e("/client_streamz/chime_android/sdk/registration/request_builder_count", new imp("app_package_name", String.class), new imp("encryption_requested", Boolean.class), new imp("key_generation_result", Boolean.class));
                        e12.d();
                        return e12;
                    case 15:
                        imq e13 = this.a.a.e("/client_streamz/gnp_android/gnp/registration/multi_login_update_total_accounts_count", new imp("app_package_name", String.class), new imp("status", String.class));
                        e13.d();
                        return e13;
                    case 16:
                        imn c4 = this.a.a.c("/client_streamz/chime_android/push/decompression/latency", new imp("app_package_name", String.class), new imp("failure", Boolean.class));
                        c4.d();
                        return c4;
                    case 17:
                        imq e14 = this.a.a.e("/client_streamz/gnp_android/registration/registration_request_builder_count", new imp("app_package_name", String.class), new imp("encryption_requested", Boolean.class), new imp("key_generation_result", Boolean.class));
                        e14.d();
                        return e14;
                    case 18:
                        imq e15 = this.a.a.e("/client_streamz/gnp_android/job/chime_job_count", new imp("app_package_name", String.class), new imp("android_sdk_version", Integer.class), new imp("is_gnp_job", Boolean.class), new imp("job_key", String.class), new imp("executed_in_place", Boolean.class), new imp("result", String.class));
                        e15.d();
                        return e15;
                    case 19:
                        imq e16 = this.a.a.e("/client_streamz/gnp_android/registration/registration_request_count", new imp("app_package_name", String.class), new imp("registration_reason", String.class), new imp("status", String.class));
                        e16.d();
                        return e16;
                    default:
                        imq e17 = this.a.a.e("/client_streamz/gnp_android/job/input_builder_result_count", new imp("app_package_name", String.class), new imp("is_success", Boolean.class));
                        e17.d();
                        return e17;
                }
            }
        });
        final int i18 = 3;
        hwx.H(new jfe(this) { // from class: gve
            public final /* synthetic */ gvg a;

            {
                this.a = this;
            }

            @Override // defpackage.jfe
            public final Object a() {
                switch (i18) {
                    case 0:
                        imq e = this.a.a.e("/client_streamz/gnp_android/gnp/registration/multi_login_update_request_count", new imp("app_package_name", String.class), new imp("status", String.class));
                        e.d();
                        return e;
                    case 1:
                        imq e2 = this.a.a.e("/client_streamz/gnp_android/growthkit_impressions_count", new imp("package_name", String.class), new imp("user_action", String.class));
                        e2.d();
                        return e2;
                    case 2:
                        imq e3 = this.a.a.e("/client_streamz/gnp_android/growthkit_promotions_fetched", new imp("package_name", String.class), new imp("account_type", String.class));
                        e3.d();
                        return e3;
                    case 3:
                        imq e4 = this.a.a.e("/client_streamz/gnp_android/growthkit_network_library_count", new imp("package_name", String.class), new imp("network_library", String.class), new imp("status", String.class));
                        e4.d();
                        return e4;
                    case 4:
                        imq e5 = this.a.a.e("/client_streamz/gnp_android/push/decryption/request_count", new imp("app_package_name", String.class), new imp("failure", Boolean.class), new imp("has_placeholder", Boolean.class), new imp("fetched_threads", Boolean.class));
                        e5.d();
                        return e5;
                    case 5:
                        imq e6 = this.a.a.e("/client_streamz/gnp_android/growthkit_event_logged", new imp("package_name", String.class), new imp("account_type", String.class), new imp("event_code", String.class));
                        e6.d();
                        return e6;
                    case 6:
                        imn c = this.a.a.c("/client_streamz/gnp_android/growthkit_event_processing_latency", new imp("package_name", String.class), new imp("cache_enabled", Boolean.class), new imp("optimized_flow", Boolean.class), new imp("promo_shown", Boolean.class));
                        c.d();
                        return c;
                    case 7:
                        imn c2 = this.a.a.c("/client_streamz/gnp_android/growthkit_event_queue_time", new imp("package_name", String.class), new imp("cache_enabled", Boolean.class), new imp("optimized_flow", Boolean.class), new imp("promo_shown", Boolean.class));
                        c2.d();
                        return c2;
                    case 8:
                        imn c3 = this.a.a.c("/client_streamz/gnp_android/push/decryption/latency", new imp("app_package_name", String.class), new imp("failure", Boolean.class), new imp("fetched_threads", Boolean.class));
                        c3.d();
                        return c3;
                    case 9:
                        imq e7 = this.a.a.e("/client_streamz/gnp_android/chime/chime_account_storage_facade/insert_account_to_both_storages_count", new imp("app_package_name", String.class), new imp("gnp_insertion_equals_chime", Boolean.class));
                        e7.d();
                        return e7;
                    case 10:
                        imq e8 = this.a.a.e("/client_streamz/gnp_android/chime/chime_account_storage_facade/remove_account_from_both_storages_count", new imp("app_package_name", String.class), new imp("gnp_removal_equals_chime", Boolean.class));
                        e8.d();
                        return e8;
                    case 11:
                        imq e9 = this.a.a.e("/client_streamz/gnp_android/chime/chime_account_storage_facade/update_account_on_both_storages_count", new imp("app_package_name", String.class), new imp("gnp_update_equals_chime", Boolean.class));
                        e9.d();
                        return e9;
                    case 12:
                        imq e10 = this.a.a.e("/client_streamz/gnp_android/tray_management/tray_instructions_processing_count", new imp("app_package_name", String.class), new imp("requested_tray_limit", Integer.class), new imp("above_tray_limit_count", Integer.class), new imp("requested_slot_limit", Integer.class), new imp("above_slot_limit_count", Integer.class));
                        e10.d();
                        return e10;
                    case 13:
                        imq e11 = this.a.a.e("/client_streamz/gnp_android/storage/chimegnp_storage_comparison", new imp("app_package_name", String.class), new imp("accounts_count_equal", Boolean.class), new imp("accounts_content_equal", Boolean.class), new imp("migration_performed", Boolean.class));
                        e11.d();
                        return e11;
                    case 14:
                        imq e12 = this.a.a.e("/client_streamz/chime_android/sdk/registration/request_builder_count", new imp("app_package_name", String.class), new imp("encryption_requested", Boolean.class), new imp("key_generation_result", Boolean.class));
                        e12.d();
                        return e12;
                    case 15:
                        imq e13 = this.a.a.e("/client_streamz/gnp_android/gnp/registration/multi_login_update_total_accounts_count", new imp("app_package_name", String.class), new imp("status", String.class));
                        e13.d();
                        return e13;
                    case 16:
                        imn c4 = this.a.a.c("/client_streamz/chime_android/push/decompression/latency", new imp("app_package_name", String.class), new imp("failure", Boolean.class));
                        c4.d();
                        return c4;
                    case 17:
                        imq e14 = this.a.a.e("/client_streamz/gnp_android/registration/registration_request_builder_count", new imp("app_package_name", String.class), new imp("encryption_requested", Boolean.class), new imp("key_generation_result", Boolean.class));
                        e14.d();
                        return e14;
                    case 18:
                        imq e15 = this.a.a.e("/client_streamz/gnp_android/job/chime_job_count", new imp("app_package_name", String.class), new imp("android_sdk_version", Integer.class), new imp("is_gnp_job", Boolean.class), new imp("job_key", String.class), new imp("executed_in_place", Boolean.class), new imp("result", String.class));
                        e15.d();
                        return e15;
                    case 19:
                        imq e16 = this.a.a.e("/client_streamz/gnp_android/registration/registration_request_count", new imp("app_package_name", String.class), new imp("registration_reason", String.class), new imp("status", String.class));
                        e16.d();
                        return e16;
                    default:
                        imq e17 = this.a.a.e("/client_streamz/gnp_android/job/input_builder_result_count", new imp("app_package_name", String.class), new imp("is_success", Boolean.class));
                        e17.d();
                        return e17;
                }
            }
        });
        final int i19 = 5;
        hwx.H(new jfe(this) { // from class: gve
            public final /* synthetic */ gvg a;

            {
                this.a = this;
            }

            @Override // defpackage.jfe
            public final Object a() {
                switch (i19) {
                    case 0:
                        imq e = this.a.a.e("/client_streamz/gnp_android/gnp/registration/multi_login_update_request_count", new imp("app_package_name", String.class), new imp("status", String.class));
                        e.d();
                        return e;
                    case 1:
                        imq e2 = this.a.a.e("/client_streamz/gnp_android/growthkit_impressions_count", new imp("package_name", String.class), new imp("user_action", String.class));
                        e2.d();
                        return e2;
                    case 2:
                        imq e3 = this.a.a.e("/client_streamz/gnp_android/growthkit_promotions_fetched", new imp("package_name", String.class), new imp("account_type", String.class));
                        e3.d();
                        return e3;
                    case 3:
                        imq e4 = this.a.a.e("/client_streamz/gnp_android/growthkit_network_library_count", new imp("package_name", String.class), new imp("network_library", String.class), new imp("status", String.class));
                        e4.d();
                        return e4;
                    case 4:
                        imq e5 = this.a.a.e("/client_streamz/gnp_android/push/decryption/request_count", new imp("app_package_name", String.class), new imp("failure", Boolean.class), new imp("has_placeholder", Boolean.class), new imp("fetched_threads", Boolean.class));
                        e5.d();
                        return e5;
                    case 5:
                        imq e6 = this.a.a.e("/client_streamz/gnp_android/growthkit_event_logged", new imp("package_name", String.class), new imp("account_type", String.class), new imp("event_code", String.class));
                        e6.d();
                        return e6;
                    case 6:
                        imn c = this.a.a.c("/client_streamz/gnp_android/growthkit_event_processing_latency", new imp("package_name", String.class), new imp("cache_enabled", Boolean.class), new imp("optimized_flow", Boolean.class), new imp("promo_shown", Boolean.class));
                        c.d();
                        return c;
                    case 7:
                        imn c2 = this.a.a.c("/client_streamz/gnp_android/growthkit_event_queue_time", new imp("package_name", String.class), new imp("cache_enabled", Boolean.class), new imp("optimized_flow", Boolean.class), new imp("promo_shown", Boolean.class));
                        c2.d();
                        return c2;
                    case 8:
                        imn c3 = this.a.a.c("/client_streamz/gnp_android/push/decryption/latency", new imp("app_package_name", String.class), new imp("failure", Boolean.class), new imp("fetched_threads", Boolean.class));
                        c3.d();
                        return c3;
                    case 9:
                        imq e7 = this.a.a.e("/client_streamz/gnp_android/chime/chime_account_storage_facade/insert_account_to_both_storages_count", new imp("app_package_name", String.class), new imp("gnp_insertion_equals_chime", Boolean.class));
                        e7.d();
                        return e7;
                    case 10:
                        imq e8 = this.a.a.e("/client_streamz/gnp_android/chime/chime_account_storage_facade/remove_account_from_both_storages_count", new imp("app_package_name", String.class), new imp("gnp_removal_equals_chime", Boolean.class));
                        e8.d();
                        return e8;
                    case 11:
                        imq e9 = this.a.a.e("/client_streamz/gnp_android/chime/chime_account_storage_facade/update_account_on_both_storages_count", new imp("app_package_name", String.class), new imp("gnp_update_equals_chime", Boolean.class));
                        e9.d();
                        return e9;
                    case 12:
                        imq e10 = this.a.a.e("/client_streamz/gnp_android/tray_management/tray_instructions_processing_count", new imp("app_package_name", String.class), new imp("requested_tray_limit", Integer.class), new imp("above_tray_limit_count", Integer.class), new imp("requested_slot_limit", Integer.class), new imp("above_slot_limit_count", Integer.class));
                        e10.d();
                        return e10;
                    case 13:
                        imq e11 = this.a.a.e("/client_streamz/gnp_android/storage/chimegnp_storage_comparison", new imp("app_package_name", String.class), new imp("accounts_count_equal", Boolean.class), new imp("accounts_content_equal", Boolean.class), new imp("migration_performed", Boolean.class));
                        e11.d();
                        return e11;
                    case 14:
                        imq e12 = this.a.a.e("/client_streamz/chime_android/sdk/registration/request_builder_count", new imp("app_package_name", String.class), new imp("encryption_requested", Boolean.class), new imp("key_generation_result", Boolean.class));
                        e12.d();
                        return e12;
                    case 15:
                        imq e13 = this.a.a.e("/client_streamz/gnp_android/gnp/registration/multi_login_update_total_accounts_count", new imp("app_package_name", String.class), new imp("status", String.class));
                        e13.d();
                        return e13;
                    case 16:
                        imn c4 = this.a.a.c("/client_streamz/chime_android/push/decompression/latency", new imp("app_package_name", String.class), new imp("failure", Boolean.class));
                        c4.d();
                        return c4;
                    case 17:
                        imq e14 = this.a.a.e("/client_streamz/gnp_android/registration/registration_request_builder_count", new imp("app_package_name", String.class), new imp("encryption_requested", Boolean.class), new imp("key_generation_result", Boolean.class));
                        e14.d();
                        return e14;
                    case 18:
                        imq e15 = this.a.a.e("/client_streamz/gnp_android/job/chime_job_count", new imp("app_package_name", String.class), new imp("android_sdk_version", Integer.class), new imp("is_gnp_job", Boolean.class), new imp("job_key", String.class), new imp("executed_in_place", Boolean.class), new imp("result", String.class));
                        e15.d();
                        return e15;
                    case 19:
                        imq e16 = this.a.a.e("/client_streamz/gnp_android/registration/registration_request_count", new imp("app_package_name", String.class), new imp("registration_reason", String.class), new imp("status", String.class));
                        e16.d();
                        return e16;
                    default:
                        imq e17 = this.a.a.e("/client_streamz/gnp_android/job/input_builder_result_count", new imp("app_package_name", String.class), new imp("is_success", Boolean.class));
                        e17.d();
                        return e17;
                }
            }
        });
        final int i20 = 6;
        hwx.H(new jfe(this) { // from class: gve
            public final /* synthetic */ gvg a;

            {
                this.a = this;
            }

            @Override // defpackage.jfe
            public final Object a() {
                switch (i20) {
                    case 0:
                        imq e = this.a.a.e("/client_streamz/gnp_android/gnp/registration/multi_login_update_request_count", new imp("app_package_name", String.class), new imp("status", String.class));
                        e.d();
                        return e;
                    case 1:
                        imq e2 = this.a.a.e("/client_streamz/gnp_android/growthkit_impressions_count", new imp("package_name", String.class), new imp("user_action", String.class));
                        e2.d();
                        return e2;
                    case 2:
                        imq e3 = this.a.a.e("/client_streamz/gnp_android/growthkit_promotions_fetched", new imp("package_name", String.class), new imp("account_type", String.class));
                        e3.d();
                        return e3;
                    case 3:
                        imq e4 = this.a.a.e("/client_streamz/gnp_android/growthkit_network_library_count", new imp("package_name", String.class), new imp("network_library", String.class), new imp("status", String.class));
                        e4.d();
                        return e4;
                    case 4:
                        imq e5 = this.a.a.e("/client_streamz/gnp_android/push/decryption/request_count", new imp("app_package_name", String.class), new imp("failure", Boolean.class), new imp("has_placeholder", Boolean.class), new imp("fetched_threads", Boolean.class));
                        e5.d();
                        return e5;
                    case 5:
                        imq e6 = this.a.a.e("/client_streamz/gnp_android/growthkit_event_logged", new imp("package_name", String.class), new imp("account_type", String.class), new imp("event_code", String.class));
                        e6.d();
                        return e6;
                    case 6:
                        imn c = this.a.a.c("/client_streamz/gnp_android/growthkit_event_processing_latency", new imp("package_name", String.class), new imp("cache_enabled", Boolean.class), new imp("optimized_flow", Boolean.class), new imp("promo_shown", Boolean.class));
                        c.d();
                        return c;
                    case 7:
                        imn c2 = this.a.a.c("/client_streamz/gnp_android/growthkit_event_queue_time", new imp("package_name", String.class), new imp("cache_enabled", Boolean.class), new imp("optimized_flow", Boolean.class), new imp("promo_shown", Boolean.class));
                        c2.d();
                        return c2;
                    case 8:
                        imn c3 = this.a.a.c("/client_streamz/gnp_android/push/decryption/latency", new imp("app_package_name", String.class), new imp("failure", Boolean.class), new imp("fetched_threads", Boolean.class));
                        c3.d();
                        return c3;
                    case 9:
                        imq e7 = this.a.a.e("/client_streamz/gnp_android/chime/chime_account_storage_facade/insert_account_to_both_storages_count", new imp("app_package_name", String.class), new imp("gnp_insertion_equals_chime", Boolean.class));
                        e7.d();
                        return e7;
                    case 10:
                        imq e8 = this.a.a.e("/client_streamz/gnp_android/chime/chime_account_storage_facade/remove_account_from_both_storages_count", new imp("app_package_name", String.class), new imp("gnp_removal_equals_chime", Boolean.class));
                        e8.d();
                        return e8;
                    case 11:
                        imq e9 = this.a.a.e("/client_streamz/gnp_android/chime/chime_account_storage_facade/update_account_on_both_storages_count", new imp("app_package_name", String.class), new imp("gnp_update_equals_chime", Boolean.class));
                        e9.d();
                        return e9;
                    case 12:
                        imq e10 = this.a.a.e("/client_streamz/gnp_android/tray_management/tray_instructions_processing_count", new imp("app_package_name", String.class), new imp("requested_tray_limit", Integer.class), new imp("above_tray_limit_count", Integer.class), new imp("requested_slot_limit", Integer.class), new imp("above_slot_limit_count", Integer.class));
                        e10.d();
                        return e10;
                    case 13:
                        imq e11 = this.a.a.e("/client_streamz/gnp_android/storage/chimegnp_storage_comparison", new imp("app_package_name", String.class), new imp("accounts_count_equal", Boolean.class), new imp("accounts_content_equal", Boolean.class), new imp("migration_performed", Boolean.class));
                        e11.d();
                        return e11;
                    case 14:
                        imq e12 = this.a.a.e("/client_streamz/chime_android/sdk/registration/request_builder_count", new imp("app_package_name", String.class), new imp("encryption_requested", Boolean.class), new imp("key_generation_result", Boolean.class));
                        e12.d();
                        return e12;
                    case 15:
                        imq e13 = this.a.a.e("/client_streamz/gnp_android/gnp/registration/multi_login_update_total_accounts_count", new imp("app_package_name", String.class), new imp("status", String.class));
                        e13.d();
                        return e13;
                    case 16:
                        imn c4 = this.a.a.c("/client_streamz/chime_android/push/decompression/latency", new imp("app_package_name", String.class), new imp("failure", Boolean.class));
                        c4.d();
                        return c4;
                    case 17:
                        imq e14 = this.a.a.e("/client_streamz/gnp_android/registration/registration_request_builder_count", new imp("app_package_name", String.class), new imp("encryption_requested", Boolean.class), new imp("key_generation_result", Boolean.class));
                        e14.d();
                        return e14;
                    case 18:
                        imq e15 = this.a.a.e("/client_streamz/gnp_android/job/chime_job_count", new imp("app_package_name", String.class), new imp("android_sdk_version", Integer.class), new imp("is_gnp_job", Boolean.class), new imp("job_key", String.class), new imp("executed_in_place", Boolean.class), new imp("result", String.class));
                        e15.d();
                        return e15;
                    case 19:
                        imq e16 = this.a.a.e("/client_streamz/gnp_android/registration/registration_request_count", new imp("app_package_name", String.class), new imp("registration_reason", String.class), new imp("status", String.class));
                        e16.d();
                        return e16;
                    default:
                        imq e17 = this.a.a.e("/client_streamz/gnp_android/job/input_builder_result_count", new imp("app_package_name", String.class), new imp("is_success", Boolean.class));
                        e17.d();
                        return e17;
                }
            }
        });
        final int i21 = 7;
        hwx.H(new jfe(this) { // from class: gve
            public final /* synthetic */ gvg a;

            {
                this.a = this;
            }

            @Override // defpackage.jfe
            public final Object a() {
                switch (i21) {
                    case 0:
                        imq e = this.a.a.e("/client_streamz/gnp_android/gnp/registration/multi_login_update_request_count", new imp("app_package_name", String.class), new imp("status", String.class));
                        e.d();
                        return e;
                    case 1:
                        imq e2 = this.a.a.e("/client_streamz/gnp_android/growthkit_impressions_count", new imp("package_name", String.class), new imp("user_action", String.class));
                        e2.d();
                        return e2;
                    case 2:
                        imq e3 = this.a.a.e("/client_streamz/gnp_android/growthkit_promotions_fetched", new imp("package_name", String.class), new imp("account_type", String.class));
                        e3.d();
                        return e3;
                    case 3:
                        imq e4 = this.a.a.e("/client_streamz/gnp_android/growthkit_network_library_count", new imp("package_name", String.class), new imp("network_library", String.class), new imp("status", String.class));
                        e4.d();
                        return e4;
                    case 4:
                        imq e5 = this.a.a.e("/client_streamz/gnp_android/push/decryption/request_count", new imp("app_package_name", String.class), new imp("failure", Boolean.class), new imp("has_placeholder", Boolean.class), new imp("fetched_threads", Boolean.class));
                        e5.d();
                        return e5;
                    case 5:
                        imq e6 = this.a.a.e("/client_streamz/gnp_android/growthkit_event_logged", new imp("package_name", String.class), new imp("account_type", String.class), new imp("event_code", String.class));
                        e6.d();
                        return e6;
                    case 6:
                        imn c = this.a.a.c("/client_streamz/gnp_android/growthkit_event_processing_latency", new imp("package_name", String.class), new imp("cache_enabled", Boolean.class), new imp("optimized_flow", Boolean.class), new imp("promo_shown", Boolean.class));
                        c.d();
                        return c;
                    case 7:
                        imn c2 = this.a.a.c("/client_streamz/gnp_android/growthkit_event_queue_time", new imp("package_name", String.class), new imp("cache_enabled", Boolean.class), new imp("optimized_flow", Boolean.class), new imp("promo_shown", Boolean.class));
                        c2.d();
                        return c2;
                    case 8:
                        imn c3 = this.a.a.c("/client_streamz/gnp_android/push/decryption/latency", new imp("app_package_name", String.class), new imp("failure", Boolean.class), new imp("fetched_threads", Boolean.class));
                        c3.d();
                        return c3;
                    case 9:
                        imq e7 = this.a.a.e("/client_streamz/gnp_android/chime/chime_account_storage_facade/insert_account_to_both_storages_count", new imp("app_package_name", String.class), new imp("gnp_insertion_equals_chime", Boolean.class));
                        e7.d();
                        return e7;
                    case 10:
                        imq e8 = this.a.a.e("/client_streamz/gnp_android/chime/chime_account_storage_facade/remove_account_from_both_storages_count", new imp("app_package_name", String.class), new imp("gnp_removal_equals_chime", Boolean.class));
                        e8.d();
                        return e8;
                    case 11:
                        imq e9 = this.a.a.e("/client_streamz/gnp_android/chime/chime_account_storage_facade/update_account_on_both_storages_count", new imp("app_package_name", String.class), new imp("gnp_update_equals_chime", Boolean.class));
                        e9.d();
                        return e9;
                    case 12:
                        imq e10 = this.a.a.e("/client_streamz/gnp_android/tray_management/tray_instructions_processing_count", new imp("app_package_name", String.class), new imp("requested_tray_limit", Integer.class), new imp("above_tray_limit_count", Integer.class), new imp("requested_slot_limit", Integer.class), new imp("above_slot_limit_count", Integer.class));
                        e10.d();
                        return e10;
                    case 13:
                        imq e11 = this.a.a.e("/client_streamz/gnp_android/storage/chimegnp_storage_comparison", new imp("app_package_name", String.class), new imp("accounts_count_equal", Boolean.class), new imp("accounts_content_equal", Boolean.class), new imp("migration_performed", Boolean.class));
                        e11.d();
                        return e11;
                    case 14:
                        imq e12 = this.a.a.e("/client_streamz/chime_android/sdk/registration/request_builder_count", new imp("app_package_name", String.class), new imp("encryption_requested", Boolean.class), new imp("key_generation_result", Boolean.class));
                        e12.d();
                        return e12;
                    case 15:
                        imq e13 = this.a.a.e("/client_streamz/gnp_android/gnp/registration/multi_login_update_total_accounts_count", new imp("app_package_name", String.class), new imp("status", String.class));
                        e13.d();
                        return e13;
                    case 16:
                        imn c4 = this.a.a.c("/client_streamz/chime_android/push/decompression/latency", new imp("app_package_name", String.class), new imp("failure", Boolean.class));
                        c4.d();
                        return c4;
                    case 17:
                        imq e14 = this.a.a.e("/client_streamz/gnp_android/registration/registration_request_builder_count", new imp("app_package_name", String.class), new imp("encryption_requested", Boolean.class), new imp("key_generation_result", Boolean.class));
                        e14.d();
                        return e14;
                    case 18:
                        imq e15 = this.a.a.e("/client_streamz/gnp_android/job/chime_job_count", new imp("app_package_name", String.class), new imp("android_sdk_version", Integer.class), new imp("is_gnp_job", Boolean.class), new imp("job_key", String.class), new imp("executed_in_place", Boolean.class), new imp("result", String.class));
                        e15.d();
                        return e15;
                    case 19:
                        imq e16 = this.a.a.e("/client_streamz/gnp_android/registration/registration_request_count", new imp("app_package_name", String.class), new imp("registration_reason", String.class), new imp("status", String.class));
                        e16.d();
                        return e16;
                    default:
                        imq e17 = this.a.a.e("/client_streamz/gnp_android/job/input_builder_result_count", new imp("app_package_name", String.class), new imp("is_success", Boolean.class));
                        e17.d();
                        return e17;
                }
            }
        });
        imu d = imu.d("gnp_android");
        this.a = d;
        imt imtVar = d.c;
        if (imtVar == null) {
            this.j = imw.c(kpbVar, scheduledExecutorService, d, application);
        } else {
            this.j = imtVar;
            ((imw) imtVar).f = kpbVar;
        }
    }

    public final void a(String str, int i, boolean z, String str2, boolean z2, String str3) {
        ((imq) this.n.a()).b(str, Integer.valueOf(i), Boolean.valueOf(z), str2, Boolean.valueOf(z2), str3);
    }

    public final void b(String str, String str2, String str3, int i, String str4) {
        ((imq) this.k.a()).b(str, str2, str3, Integer.valueOf(i), str4);
    }

    public final void c(String str, boolean z) {
        ((imq) this.o.a()).b(str, Boolean.valueOf(z));
    }

    public final void d(String str, String str2) {
        ((imq) this.m.a()).b(str, str2);
    }

    public final void e(int i, String str, String str2) {
        ((imq) this.l.a()).c(i, str, str2);
    }
}
