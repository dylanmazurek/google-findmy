package defpackage;

import android.content.Context;
import android.os.Build;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.adm.R;
import com.google.android.material.card.MaterialCardView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ewq {
    public static final jnk a = jnk.l("com/google/android/apps/adm/suggestedaction/SuggestedActionCard");
    private final Context b;
    private final ewv c;
    private final dxf d;

    public ewq(ewv ewvVar, Context context, dxf dxfVar) {
        this.b = context;
        this.c = ewvVar;
        this.d = dxfVar;
    }

    private final int c(MaterialCardView materialCardView, int i) {
        if (i != 0) {
            int i2 = i - 1;
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 != 2) {
                        return iqg.c(materialCardView, R.attr.colorTertiary);
                    }
                    return iqg.c(materialCardView, R.attr.colorOnSurface);
                }
                return this.b.getResources().getColor(R.color.accent_warning);
            }
            return this.b.getResources().getColor(R.color.accent_error);
        }
        throw null;
    }

    public final void a(lnb lnbVar, ewo ewoVar) {
        ljh k = lmu.i.k();
        ljh k2 = lmz.c.k();
        if (!k2.b.y()) {
            k2.t();
        }
        int i = ewoVar.x;
        lmz lmzVar = (lmz) k2.b;
        if (i != 0) {
            lmzVar.b = i - 1;
            lmzVar.a |= 1;
            lmz lmzVar2 = (lmz) k2.q();
            if (!k.b.y()) {
                k.t();
            }
            dxf dxfVar = this.d;
            lmu lmuVar = (lmu) k.b;
            lmzVar2.getClass();
            lmuVar.h = lmzVar2;
            lmuVar.a |= 512;
            dxfVar.b(lnbVar, jer.i((lmu) k.q()));
            return;
        }
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v97, types: [java.lang.CharSequence, java.lang.Object] */
    public final void b(MaterialCardView materialCardView, ewo ewoVar) {
        jer jerVar;
        int i;
        int i2;
        int i3;
        int color;
        if (ewoVar == null) {
            return;
        }
        ewv ewvVar = this.c;
        int i4 = 15;
        switch (ewoVar.ordinal()) {
            case 0:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
                jerVar = jdl.a;
                break;
            case 1:
                ewr ewrVar = new ewr(null);
                ewrVar.a = ewvVar.b(R.string.spot_device_sync_recommendation_card_title);
                ewrVar.c(ewvVar.b(R.string.spot_device_sync_recommendation_card_subtitle));
                ewrVar.b(R.drawable.gs_not_listed_location_vd_theme_24);
                ewrVar.d = new eub(ewvVar, 12);
                ewrVar.e = 1;
                ewrVar.c = false;
                jerVar = jer.i(ewrVar.a());
                break;
            case 2:
                ewr ewrVar2 = new ewr(null);
                ewrVar2.a = ewvVar.b(R.string.spot_enable_location_recommendation_card_title);
                ewrVar2.c(ewvVar.b(R.string.spot_enable_location_recommendation_card_subtitle));
                ewrVar2.b(R.drawable.gs_location_off_vd_theme_24);
                ewrVar2.d = new eub(ewvVar, 8);
                ewrVar2.e = 1;
                ewrVar2.c = false;
                jerVar = jer.i(ewrVar2.a());
                break;
            case 3:
                ewr ewrVar3 = new ewr(null);
                ewrVar3.a = ewvVar.b(R.string.spot_enable_bluetooth_recommendation_card_title);
                ewrVar3.c(ewvVar.b(R.string.spot_enable_bluetooth_recommendation_card_subtitle));
                ewrVar3.b(R.drawable.gs_bluetooth_disabled_vd_theme_24);
                ewrVar3.d = new eub(ewvVar, 10);
                ewrVar3.e = 1;
                ewrVar3.c = false;
                jerVar = jer.i(ewrVar3.a());
                break;
            case 4:
                ewr ewrVar4 = new ewr(null);
                ewrVar4.a = ewvVar.b(R.string.spot_allow_location_access_recommendation_card_title);
                ewrVar4.c(ewvVar.b(R.string.spot_allow_location_recommendation_card_subtitle));
                ewrVar4.b(R.drawable.gs_location_off_vd_theme_24);
                ewrVar4.d = new eub(ewvVar, 11);
                ewrVar4.e = 1;
                ewrVar4.c = true;
                jerVar = jer.i(ewrVar4.a());
                break;
            case 5:
                if (Build.VERSION.SDK_INT < 31) {
                    jerVar = jdl.a;
                    break;
                } else {
                    ewr ewrVar5 = new ewr(null);
                    ewrVar5.a = ewvVar.b(R.string.spot_allow_bluetooth_access_recommendation_card_title);
                    ewrVar5.c(ewvVar.b(R.string.spot_allow_bluetooth_access_recommendation_card_subtitle));
                    ewrVar5.b(R.drawable.gs_nearby_off_vd_theme_24);
                    ewrVar5.d = new eub(ewvVar, 18);
                    ewrVar5.e = 1;
                    ewrVar5.c = true;
                    jerVar = jer.i(ewrVar5.a());
                    break;
                }
            case 6:
                jerVar = ewvVar.g.b(new ett(ewvVar, 14));
                break;
            case 7:
                if (!ewvVar.g.g()) {
                    jerVar = jdl.a;
                    break;
                } else {
                    int i5 = 16;
                    jer b = ewvVar.a().b(new ett(ewvVar, i5));
                    if (b.g()) {
                        kzc kzcVar = ((kyf) b.c()).d;
                        if (kzcVar == null) {
                            kzcVar = kzc.c;
                        }
                        if (eku.k(kzcVar)) {
                            ewr ewrVar6 = new ewr(null);
                            ewrVar6.a = ewvVar.b(R.string.spot_lost_device_recommendation_card_title);
                            ewrVar6.b(R.drawable.gs_notifications_active_vd_theme_24);
                            kyl kylVar = ((kyf) b.c()).c;
                            if (kylVar == null) {
                                kylVar = kyl.j;
                            }
                            if (1 != (kylVar.a & 1)) {
                                i = R.string.spot_lost_device_recommendation_card_subtitle;
                            } else {
                                i = R.string.spot_lost_device_recommendation_card_subtitle_with_contact_info;
                            }
                            ewrVar6.c(ewvVar.b(i));
                            ewrVar6.d = new eub(ewvVar, i5);
                            ewrVar6.e = 3;
                            ewrVar6.c = true;
                            jerVar = jer.i(ewrVar6.a());
                            break;
                        }
                    }
                    jerVar = jdl.a;
                    break;
                }
            case 8:
                ewr ewrVar7 = new ewr(null);
                ewrVar7.a = ewvVar.b(R.string.spot_pending_sharing_application_recommendation_card_title);
                ewrVar7.b(R.drawable.gs_group_vd_theme_24);
                ewrVar7.d = new ewu(ewvVar, 1);
                ewrVar7.e = 3;
                ewrVar7.c = true;
                jerVar = jer.i(ewrVar7.a());
                break;
            case 9:
                jerVar = ewvVar.a().b(new ene(10)).b(new ett(ewvVar, i4));
                break;
            case 10:
                ewr ewrVar8 = new ewr(null);
                ewrVar8.a = ewvVar.b(R.string.spot_enable_find_my_device_recommendation_card_title);
                ewrVar8.c(ewvVar.b(R.string.spot_enable_find_my_device_recommendation_card_subtitle));
                ewrVar8.b(R.drawable.gs_fmd_bad_vd_theme_24);
                ewrVar8.d = new ewu(ewvVar, 0);
                ewrVar8.e = 1;
                ewrVar8.c = true;
                jerVar = jer.i(ewrVar8.a());
                break;
            case 11:
                ewr ewrVar9 = new ewr(null);
                ewrVar9.a = ewvVar.b(R.string.spot_enable_fmdn_recommendation_card_title);
                ewrVar9.c(ewvVar.b(R.string.spot_enable_fmdn_recommendation_card_subtitle));
                ewrVar9.b(R.drawable.gs_fmd_bad_vd_theme_24);
                ewrVar9.d = new eub(ewvVar, 14);
                ewrVar9.e = 2;
                ewrVar9.c = true;
                jerVar = jer.i(ewrVar9.a());
                break;
            case 12:
                ewr ewrVar10 = new ewr(null);
                ewrVar10.a = ewvVar.b(R.string.spot_find_my_device_network_all_areas_recommendation_card_title);
                ewrVar10.c(ewvVar.b(R.string.spot_find_my_device_network_all_areas_recommendation_card_subtitle));
                ewrVar10.b(R.drawable.gs_fmd_bad_vd_theme_24);
                ewrVar10.d = new eub(ewvVar, 20);
                ewrVar10.e = 2;
                ewrVar10.c = true;
                jerVar = jer.i(ewrVar10.a());
                break;
            case 13:
                ewr ewrVar11 = new ewr(null);
                ewrVar11.a = ewvVar.b(R.string.spot_enable_location_recommendation_card_title);
                ewrVar11.c(ewvVar.b(R.string.spot_enable_location_recommendation_card_subtitle));
                ewrVar11.b(R.drawable.gs_location_off_vd_theme_24);
                ewrVar11.d = new eub(ewvVar, i4);
                ewrVar11.e = 2;
                ewrVar11.c = true;
                jerVar = jer.i(ewrVar11.a());
                break;
            case 14:
                ewr ewrVar12 = new ewr(null);
                ewrVar12.a = ewvVar.b(R.string.supervised_android_share_location_title);
                ewrVar12.c(ewvVar.b(R.string.supervised_android_share_location_subtitle));
                ewrVar12.b(R.drawable.gs_not_listed_location_vd_theme_24);
                ewrVar12.d = new eub(ewvVar, 13);
                ewrVar12.e = 3;
                ewrVar12.c = true;
                jerVar = jer.i(ewrVar12.a());
                break;
            case 15:
                ewr ewrVar13 = new ewr(null);
                ewrVar13.a = ewvVar.b(R.string.supervised_android_google_location_accuracy_card_title);
                ewrVar13.c(ewvVar.b(R.string.spot_enable_location_recommendation_card_subtitle));
                ewrVar13.b(R.drawable.gs_location_off_vd_theme_24);
                ewrVar13.d = new eub(ewvVar, 17);
                ewrVar13.e = 2;
                ewrVar13.c = true;
                jerVar = jer.i(ewrVar13.a());
                break;
            case 16:
                ewr ewrVar14 = new ewr(null);
                ewrVar14.c(ewvVar.b(R.string.spot_launch_in_app_promotion_card_subtitle));
                ewrVar14.b(R.drawable.fmd_logo_monochrome_white);
                ewrVar14.b = true;
                ewrVar14.d = new eub(ewvVar, 9);
                ewrVar14.e = 4;
                ewrVar14.c = true;
                jerVar = jer.i(ewrVar14.a());
                break;
            case 22:
                ewr ewrVar15 = new ewr(null);
                ewrVar15.a = ewvVar.b(R.string.no_connection_error_title);
                ewrVar15.c(ewvVar.b(R.string.no_connection_error_subtitle));
                ewrVar15.b(R.drawable.fmd_logo_monochrome_white);
                ewrVar15.b = true;
                ewrVar15.d = new eub(ewvVar, 7);
                ewrVar15.e = 1;
                ewrVar15.c = true;
                jerVar = jer.i(ewrVar15.a());
                break;
            default:
                throw new AssertionError("unreachable");
        }
        if (jerVar.g()) {
            a(lnb.SUGGESTED_ACTION_CARD_SHOWN, ewoVar);
            ews ewsVar = (ews) jerVar.c();
            ImageView imageView = (ImageView) materialCardView.findViewById(R.id.suggested_action_icon);
            imageView.setImageResource(ewsVar.c);
            imageView.getDrawable().setAutoMirrored(false);
            if (((Boolean) jer.h(ewsVar.d).e(false)).booleanValue()) {
                imageView.setBackgroundResource(R.drawable.round_background);
            } else {
                imageView.setBackgroundResource(android.R.color.transparent);
                imageView.setColorFilter(c(materialCardView, ewsVar.g));
            }
            ImageView imageView2 = (ImageView) materialCardView.findViewById(R.id.suggested_action_arrow);
            if (ewsVar.e.booleanValue()) {
                imageView2.setVisibility(0);
                imageView2.getDrawable().setAutoMirrored(true);
                imageView2.setColorFilter(c(materialCardView, ewsVar.g));
                i2 = 8;
            } else {
                i2 = 8;
                imageView2.setVisibility(8);
            }
            TextView textView = (TextView) materialCardView.findViewById(R.id.suggested_action_title);
            if (ewsVar.a != null) {
                textView.setVisibility(0);
                textView.setText(ewsVar.a);
            } else {
                textView.setVisibility(i2);
            }
            TextView textView2 = (TextView) materialCardView.findViewById(R.id.suggested_action_subtitle);
            if (ewsVar.b.g()) {
                textView2.setText((CharSequence) ewsVar.b.c());
                i3 = 0;
                textView2.setVisibility(0);
            } else {
                i3 = 0;
                textView2.setVisibility(8);
            }
            materialCardView.setOnClickListener(new ewp(this, ewoVar, ewsVar, i3));
            int i6 = ewsVar.g;
            if (i6 != 0) {
                int i7 = i6 - 1;
                if (i7 != 0) {
                    if (i7 != 1) {
                        if (i7 != 2) {
                            if (i7 == 3) {
                                color = iqg.c(materialCardView, R.attr.colorTertiaryContainer);
                            } else {
                                throw new AssertionError("unreachable");
                            }
                        } else {
                            color = iqg.c(materialCardView, R.attr.colorSurfaceDim);
                        }
                    } else {
                        color = this.b.getResources().getColor(R.color.background_warning);
                    }
                } else {
                    color = this.b.getResources().getColor(R.color.background_error);
                }
                materialCardView.j(color);
                materialCardView.setVisibility(0);
                return;
            }
            throw null;
        }
        ((jni) ((jni) a.e()).j("com/google/android/apps/adm/suggestedaction/SuggestedActionCard", "updateSuggestedActionCard", 56, "SuggestedActionCard.java")).r("[FMD] No suggested action");
        materialCardView.setVisibility(8);
    }
}
