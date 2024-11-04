package defpackage;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.IntentSender;
import android.os.Bundle;
import android.view.View;
import android.view.ViewStub;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.adm.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class epy implements cfo {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ epy(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.cfo
    public final void d(Object obj) {
        boolean z;
        String T;
        jer jerVar;
        int i = 6;
        int i2 = 4;
        byte[] bArr = null;
        int i3 = 1;
        int i4 = 8;
        switch (this.b) {
            case 0:
                kxz kxzVar = (kxz) obj;
                Object obj2 = this.a;
                if (ltu.d()) {
                    eqa eqaVar = (eqa) obj2;
                    eqaVar.d.setVisibility(8);
                    eqaVar.ah.setVisibility(8);
                } else {
                    if (kxzVar.a.isEmpty()) {
                        eqa eqaVar2 = (eqa) obj2;
                        eqaVar2.d.setText(R.string.add_contact_info_phone_number);
                        eqaVar2.d.e(R.drawable.gs_add_circle_fill1_vd_theme_24);
                        eqaVar2.ah.setVisibility(8);
                    } else {
                        eqa eqaVar3 = (eqa) obj2;
                        eqaVar3.d.setText(R.string.edit_contact_info_phone_number);
                        eqaVar3.d.e(R.drawable.gs_edit_vd_theme_24);
                        eqaVar3.ah.setVisibility(0);
                    }
                    ((eqa) obj2).d.setOnClickListener(new ecp(obj2, kxzVar, i4, bArr));
                }
                String str = kxzVar.b;
                if (str.isEmpty()) {
                    eqa eqaVar4 = (eqa) obj2;
                    eqaVar4.e.setText(R.string.add_contact_info_message);
                    eqaVar4.e.e(R.drawable.gs_add_circle_fill1_vd_theme_24);
                    eqaVar4.ag.setVisibility(8);
                } else {
                    eqa eqaVar5 = (eqa) obj2;
                    eqaVar5.e.setText(R.string.edit_contact_info_message);
                    eqaVar5.e.e(R.drawable.gs_edit_vd_theme_24);
                    eqaVar5.ag.setVisibility(0);
                    eqaVar5.ag.setText(str);
                }
                final eqa eqaVar6 = (eqa) obj2;
                eqaVar6.e.setOnClickListener(new ecp(obj2, kxzVar, 9, bArr));
                if (eqaVar6.c) {
                    boolean isEmpty = kxzVar.c.isEmpty();
                    final boolean z2 = !isEmpty;
                    if (!isEmpty) {
                        eqaVar6.ai.setText(kxzVar.c);
                        eqaVar6.ai.setVisibility(0);
                        eqaVar6.af.setText(R.string.remove_contact_info_email_address);
                        eqaVar6.af.e(R.drawable.gm_filled_remove_circle_vd_theme_24);
                    } else {
                        eqaVar6.ai.setVisibility(8);
                        eqaVar6.af.setText(R.string.add_contact_info_email_address);
                        eqaVar6.af.e(R.drawable.gs_add_circle_fill1_vd_theme_24);
                    }
                    eqaVar6.af.setOnClickListener(new View.OnClickListener() { // from class: epz
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            String str2;
                            eqb eqbVar = eqa.this.b;
                            Account b = eqbVar.a.b();
                            String str3 = "";
                            if (b == null) {
                                str2 = "";
                            } else {
                                str2 = b.name;
                            }
                            boolean z3 = z2;
                            cfn cfnVar = eqbVar.d;
                            kxz kxzVar2 = (kxz) cfnVar.d();
                            kxzVar2.getClass();
                            ljh ljhVar = (ljh) kxzVar2.z(5);
                            ljhVar.w(kxzVar2);
                            if (!ljhVar.b.y()) {
                                ljhVar.t();
                            }
                            if (true != z3) {
                                str3 = str2;
                            }
                            kxz kxzVar3 = (kxz) ljhVar.b;
                            str3.getClass();
                            kxzVar3.c = str3;
                            cfnVar.l((kxz) ljhVar.q());
                        }
                    });
                    return;
                }
                eqaVar6.ai.setVisibility(8);
                eqaVar6.af.setVisibility(8);
                return;
            case 1:
                jer jerVar2 = (jer) obj;
                if (jerVar2.g()) {
                    Object obj3 = this.a;
                    epj epjVar = (epj) obj3;
                    eoy eoyVar = (eoy) epjVar.a.a().d();
                    if (eoyVar != null && eoyVar.c) {
                        epjVar.an.a((ag) obj3, (evh) jerVar2.c());
                        return;
                    }
                    return;
                }
                return;
            case 2:
                jer jerVar3 = (jer) obj;
                if (jerVar3.g()) {
                    Object obj4 = this.a;
                    ((eqa) obj4).a.a((ag) obj4, (evh) jerVar3.c());
                    return;
                }
                return;
            case 3:
                ((eqf) this.a).aH((jer) obj);
                return;
            case 4:
                eqm eqmVar = (eqm) obj;
                jer jerVar4 = eqmVar.a;
                boolean g = jerVar4.g();
                Object obj5 = this.a;
                if (g) {
                    Object c = jerVar4.c();
                    if (c == eql.MARKING_AS_LOST) {
                        ((eqf) obj5).aI(R.string.mark_as_lost_loading_text);
                        return;
                    } else if (c == eql.MARKING_AS_FOUND) {
                        ((eqf) obj5).aI(R.string.mark_as_found_loading_text);
                        return;
                    } else {
                        ((jni) ((jni) eqf.a.f()).j("com/google/android/apps/adm/integrations/spot/markaslost/MarkAsLostFragment", "updateUi", 190, "MarkAsLostFragment.java")).r("Invalid UiLoadingState");
                        return;
                    }
                }
                jer jerVar5 = eqmVar.b;
                if (jerVar5.g()) {
                    Object c2 = jerVar5.c();
                    kzc kzcVar = (kzc) c2;
                    boolean k = eku.k(kzcVar);
                    int i5 = R.string.contact_info_fragment_title;
                    if (k) {
                        Object c3 = eqmVar.c.c();
                        boolean z3 = eqmVar.d;
                        eqf eqfVar = (eqf) obj5;
                        eqfVar.af.e(eqfVar.T(R.string.mark_as_lost_fragment_title_lost_device));
                        eqfVar.e();
                        boolean z4 = kzcVar.b;
                        boolean z5 = !z4;
                        if (eqfVar.c) {
                            eqfVar.q();
                        } else {
                            eqfVar.aF(z5);
                        }
                        if (!z4) {
                            eqfVar.aG(R.string.device_marked_as_lost_by_other_owner);
                        } else if (z3) {
                            eqfVar.aG(R.string.snackbar_contact_info_updating);
                        } else {
                            eqfVar.o();
                        }
                        Button button = eqfVar.aj;
                        if (kzcVar.b && !z3) {
                            z = true;
                        } else {
                            z = false;
                        }
                        button.setEnabled(z);
                        eqfVar.ak.setEnabled(!z3);
                        eqfVar.ak.setOnClickListener(new ewp(obj5, c3, c2, i3));
                        eqfVar.ah.setVisibility(0);
                        eqfVar.ag.setVisibility(0);
                        eqfVar.ak.setVisibility(0);
                        eqfVar.am.setVisibility(0);
                        TextView textView = eqfVar.al;
                        if (true == eqfVar.b.f()) {
                            i5 = R.string.contact_info_fragment_title_already_populated;
                        }
                        textView.setText(i5);
                        eqfVar.ai.setVisibility(8);
                        eqfVar.aj.setVisibility(0);
                        eqfVar.an.setVisibility(8);
                        return;
                    }
                    Object c4 = eqmVar.c.c();
                    boolean z6 = eqmVar.d;
                    eqf eqfVar2 = (eqf) obj5;
                    eqfVar2.af.e(eqfVar2.T(R.string.mark_as_lost_fragment_title_found_device));
                    eqfVar2.e();
                    if (eqfVar2.c) {
                        eqfVar2.q();
                    } else {
                        eqfVar2.aF(false);
                    }
                    if (z6) {
                        eqfVar2.aG(R.string.snackbar_contact_info_updating);
                    } else {
                        eqfVar2.o();
                    }
                    boolean z7 = !z6;
                    eqfVar2.ai.setEnabled(z7);
                    eqfVar2.ak.setEnabled(z7);
                    eqfVar2.ak.setOnClickListener(new ecp(obj5, c4, 10, bArr));
                    eqfVar2.ah.setVisibility(0);
                    eqfVar2.ag.setVisibility(0);
                    eqfVar2.ak.setVisibility(0);
                    eqfVar2.am.setVisibility(0);
                    TextView textView2 = eqfVar2.al;
                    if (true == eqfVar2.b.f()) {
                        i5 = R.string.contact_info_fragment_title_already_populated;
                    }
                    textView2.setText(i5);
                    eqfVar2.ai.setVisibility(0);
                    eqfVar2.aj.setVisibility(8);
                    eqfVar2.an.setVisibility(8);
                    return;
                }
                return;
            case 5:
                eqv eqvVar = (eqv) this.a;
                if (eqvVar.l.g()) {
                    if (!eqvVar.h.g()) {
                        eqvVar.k.c();
                        return;
                    }
                    return;
                }
                eqvVar.k.d();
                return;
            case 6:
                eqv eqvVar2 = (eqv) this.a;
                eqvVar2.e((epk) obj, (eis) eqvVar2.m.o().getOrDefault(eqvVar2.f, eis.NOT_IN_RANGE));
                return;
            case 7:
                ((eqx) this.a).e((eso) obj);
                return;
            case 8:
                equ equVar = (equ) obj;
                int i6 = equVar.d;
                Object obj6 = this.a;
                if (i6 == 2 && !equVar.b.g()) {
                    eqx eqxVar = (eqx) obj6;
                    ViewStub viewStub = eqxVar.ak;
                    if (viewStub != null) {
                        eqxVar.al = viewStub.inflate();
                        ((ImageView) eqxVar.al.findViewById(R.id.recommendation_right_arrow)).getDrawable().setAutoMirrored(true);
                        eqxVar.ak = null;
                    }
                    eqxVar.al.setVisibility(0);
                    eqxVar.al.setOnClickListener(new eph(obj6, i2));
                    return;
                }
                View view = ((eqx) obj6).al;
                if (view != null) {
                    view.setVisibility(8);
                    return;
                }
                return;
            case 9:
                ekw ekwVar = (ekw) obj;
                eqx eqxVar2 = (eqx) this.a;
                TextView textView3 = eqxVar2.af;
                int ordinal = eqxVar2.e.ordinal();
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        if (ordinal != 3) {
                            T = ekwVar.a.g;
                        } else {
                            T = eqxVar2.T(R.string.earbuds_case);
                        }
                    } else {
                        T = eqxVar2.T(R.string.left_earbud);
                    }
                } else {
                    T = eqxVar2.T(R.string.right_earbud);
                }
                textView3.setText(T);
                if (eqxVar2.e == kyh.DEVICE_COMPONENT_CASE) {
                    boolean o = eqx.o(ekwVar, kyh.DEVICE_COMPONENT_RIGHT);
                    boolean o2 = eqx.o(ekwVar, kyh.DEVICE_COMPONENT_LEFT);
                    TextView textView4 = eqxVar2.ag;
                    if (o || o2) {
                        i4 = 0;
                    }
                    textView4.setVisibility(i4);
                    if (o && o2) {
                        eqxVar2.ag.setText(R.string.spot_nearby_both_buds_in_case);
                    } else if (o) {
                        eqxVar2.ag.setText(R.string.spot_nearby_right_bud_in_case);
                    } else if (o2) {
                        eqxVar2.ag.setText(R.string.spot_nearby_left_bud_in_case);
                    }
                }
                ekv a = ekwVar.a(eqxVar2.e);
                if (a == null) {
                    ((jni) ((jni) eqx.a.g()).j("com/google/android/apps/adm/integrations/spot/nearby/SpotDeviceNearbyFragment", "updateUiForProximity", 277, "SpotDeviceNearbyFragment.java")).r("No component UI state in getCurrentProximityState");
                    return;
                }
                jer a2 = eik.a(a.a.c(a.b), eqxVar2.z());
                if (!a2.g()) {
                    eqxVar2.ah.setVisibility(4);
                } else {
                    eqxVar2.ah.setVisibility(0);
                    eyf.n(eqxVar2.aj, eqxVar2.ai, ((eik) a2.c()).a, ((eik) a2.c()).b, ((eik) a2.c()).c, ((eik) a2.c()).d);
                }
                eqt eqtVar = eqxVar2.b;
                eis eisVar = a.b;
                eqv eqvVar3 = eqtVar.a;
                if (eisVar == eis.IN_RANGE) {
                    eqvVar3.g = true;
                }
                epk epkVar = (epk) eqvVar3.k.a().d();
                epkVar.getClass();
                eqvVar3.e(epkVar, eisVar);
                eda edaVar = (eda) eqxVar2.an.a().d();
                edaVar.getClass();
                eqxVar2.d(edaVar);
                return;
            case 10:
                ((eqx) this.a).d((eda) obj);
                return;
            case 11:
                jer jerVar6 = (jer) obj;
                if (jerVar6.g()) {
                    Object obj7 = this.a;
                    ((eqx) obj7).c.b((ag) obj7, (evh) jerVar6.c(), R.id.ring_button);
                    return;
                }
                return;
            case 12:
                esx esxVar = (esx) this.a;
                esxVar.b = (kyh) obj;
                esxVar.a();
                return;
            case 13:
                esx esxVar2 = (esx) this.a;
                esxVar2.c = (jer) obj;
                esxVar2.a();
                return;
            case 14:
                ets etsVar = (ets) obj;
                boh bohVar = new boh();
                Object obj8 = this.a;
                eth ethVar = (eth) obj8;
                bohVar.d(ethVar.d);
                ethVar.ag.setText(R.string.sharing_application_title);
                ethVar.ah.setText(R.string.sharing_application_explanation);
                ethVar.aj.setVisibility(8);
                ethVar.al.setEnabled(false);
                ethVar.al.d(null);
                ethVar.al.setText(R.string.spot_accept_sharing_invitation);
                ethVar.ak.setEnabled(false);
                ethVar.ak.setText(R.string.spot_decline_sharing_invitation);
                switch (etsVar.c - 1) {
                    case 0:
                        bohVar.l(R.id.learn_more_text, 8);
                        bohVar.l(R.id.progress_indicator_group, 0);
                        bohVar.l(R.id.accept_button, 8);
                        bohVar.l(R.id.decline_button, 8);
                        break;
                    case 1:
                        bohVar.l(R.id.failed_fetching_details_card, 0);
                        bohVar.l(R.id.accept_button, 8);
                        bohVar.l(R.id.decline_button, 8);
                        ethVar.ai.setText(R.string.fetching_sharing_application_failure);
                        break;
                    case 2:
                        ethVar.o((etr) etsVar.a.c());
                        bohVar.l(R.id.application_screen_explanation, 0);
                        ethVar.al.setEnabled(true);
                        ethVar.ak.setEnabled(true);
                        break;
                    case 3:
                    case 5:
                        ethVar.e(bohVar, (etr) etsVar.a.c());
                        break;
                    case 4:
                        pf pfVar = ethVar.c;
                        IntentSender intentSender = ((PendingIntent) etsVar.b.c()).getIntentSender();
                        intentSender.getClass();
                        pfVar.b(new pm(intentSender, null, 0, 0));
                        etu etuVar = ethVar.e;
                        etuVar.b();
                        etuVar.d(lnb.SHARING_APPLICATION_OWNER_KEY_RESOLUTION_REQUESTED);
                        ets etsVar2 = (ets) etuVar.c.d();
                        etsVar2.getClass();
                        jer jerVar7 = etsVar2.a;
                        if (!jerVar7.g()) {
                            ((jni) ((jni) etu.a.g()).j("com/google/android/apps/adm/integrations/spot/sharing/application/SharingApplicationViewModel", "onOwnerKeyResolutionRequested", 147, "SharingApplicationViewModel.java")).r("Unexpectedly owner key resolution requested without device details");
                        } else {
                            etuVar.c.l(new ets(6, jer.i(jerVar7.c()), jdl.a));
                        }
                        ethVar.e(bohVar, (etr) etsVar.a.c());
                        break;
                    case 6:
                        ((ag) obj8).H().ad();
                        break;
                    default:
                        bohVar.l(R.id.learn_more_text, 8);
                        bohVar.l(R.id.failed_fetching_details_card, 0);
                        bohVar.l(R.id.accept_button, 8);
                        bohVar.l(R.id.decline_button, 8);
                        ethVar.ai.setText(R.string.sharing_not_supported_on_this_device);
                        ethVar.aj.setVisibility(0);
                        break;
                }
                bohVar.b(ethVar.af);
                return;
            case 15:
                jer jerVar8 = (jer) obj;
                if (!jerVar8.g()) {
                    return;
                }
                Object obj9 = this.a;
                eth ethVar2 = (eth) obj9;
                evo evoVar = ethVar2.b;
                evh evhVar = (evh) jerVar8.c();
                if (ethVar2.al.getVisibility() == 0) {
                    jerVar = jer.i(Integer.valueOf(R.id.accept_button));
                } else {
                    jerVar = jdl.a;
                }
                evoVar.d((ag) obj9, evhVar, jerVar, new eka(obj9, i));
                return;
            case 16:
                etp etpVar = (etp) obj;
                int ordinal2 = etpVar.a.ordinal();
                Object obj10 = this.a;
                switch (ordinal2) {
                    case 0:
                        ((etj) obj10).o(R.string.sharing_application_use_responsibly_title, R.string.sharing_application_use_responsibly_body, jer.i(new eti(R.string.sharing_application_use_responsibly_learn_more, R.string.sharing_application_use_responsibly_learn_more)), R.drawable.spot_pairing_acceptable_use_image, R.string.sharing_application_use_responsibly_agree_button, android.R.string.cancel, etpVar.b, false);
                        break;
                    case 1:
                        ((etj) obj10).o(R.string.sharing_application_turn_on_location_title, R.string.sharing_application_turn_on_location_body, jdl.a, R.drawable.spot_sharing_enable_location, R.string.turn_on, android.R.string.cancel, etpVar.b, true);
                        break;
                    case 2:
                        ((etj) obj10).o(R.string.set_screen_lock_title, R.string.enable_screen_lock_before_sharing, jer.i(new eti(R.string.learn_more, R.string.sharing_requires_screen_loock_learn_more_a11y_label)), R.drawable.lock_code_image, R.string.set_screen_lock_button, android.R.string.cancel, etpVar.b, false);
                        break;
                    case 3:
                        ((etj) obj10).o(R.string.sharing_application_turn_on_find_my_device_title, R.string.sharing_application_turn_on_find_my_device_body, jdl.a, R.drawable.enable_find_my_device_image, R.string.turn_on, android.R.string.cancel, false, false);
                        break;
                    case 4:
                        ((etj) obj10).o(R.string.sharing_application_turn_on_last_known_location_title, R.string.sharing_application_turn_on_last_known_location_body, jer.i(new eti(R.string.learn_more, R.string.sharing_requires_screen_loock_learn_more_a11y_label)), R.drawable.enable_last_known_location_image, R.string.turn_on, android.R.string.cancel, etpVar.b, true);
                        break;
                    case 5:
                        ((etj) obj10).o(R.string.sharing_application_join_find_my_device_network_title, R.string.sharing_application_join_find_my_device_network_body, jer.i(new eti(R.string.learn_more, R.string.learn_more_about_find_my_device_network_a11y_label)), R.drawable.enable_last_known_location_image, R.string.sharing_application_join_find_my_device_network_button, R.string.skip, etpVar.b, true);
                        break;
                    case 6:
                        etk etkVar = etpVar.d;
                        Bundle bundle = new Bundle();
                        bundle.putSerializable("SharingApplicationRequirementsFragmentResult", etkVar);
                        etj etjVar = (etj) obj10;
                        etjVar.H().P("SharingApplicationRequirementsFragmentResult", bundle);
                        etjVar.H().L();
                        break;
                }
                if (etpVar.c.g()) {
                    etj etjVar2 = (etj) obj10;
                    pf pfVar2 = etjVar2.e;
                    IntentSender intentSender2 = ((PendingIntent) etpVar.c.c()).getIntentSender();
                    intentSender2.getClass();
                    pfVar2.b(new pm(intentSender2, null, 0, 0));
                    etq etqVar = etjVar2.d;
                    cfn cfnVar = etqVar.f;
                    gji gjiVar = new gji(etqVar.a());
                    gjiVar.d = jdl.a;
                    cfnVar.l(gjiVar.e());
                    return;
                }
                return;
            case 17:
                jer jerVar9 = (jer) obj;
                if (jerVar9.g()) {
                    Object obj11 = this.a;
                    ((etj) obj11).c.b((ag) obj11, (evh) jerVar9.c(), R.id.positive_button);
                    return;
                }
                return;
            case 18:
                Object obj12 = this.a;
                etx etxVar = (etx) obj12;
                etxVar.ah.d(null);
                etxVar.ai.d(null);
                int ordinal3 = ((ety) obj).ordinal();
                if (ordinal3 != 0) {
                    if (ordinal3 != 1) {
                        if (ordinal3 != 2) {
                            if (ordinal3 != 3) {
                                if (ordinal3 != 4) {
                                    return;
                                }
                                iwk.o(etxVar.K(), R.string.sharing_application_decline_success, -1).i();
                                ((ag) obj12).H().ad();
                                return;
                            }
                            etxVar.e();
                            etxVar.ai.d(fma.bL(etxVar.F()));
                            return;
                        }
                        iwk.o(etxVar.K(), R.string.sharing_application_approval_success, -1).i();
                        ((ag) obj12).H().ad();
                        return;
                    }
                    etxVar.e();
                    etxVar.ah.d(fma.bL(etxVar.F()));
                    return;
                }
                etxVar.ah.setEnabled(true);
                etxVar.ai.setEnabled(true);
                return;
            case 19:
                etd etdVar = (etd) obj;
                int i7 = etdVar.b - 1;
                Object obj13 = this.a;
                if (i7 != 0) {
                    if (i7 != 1) {
                        ((etx) obj13).ag.h();
                        return;
                    } else {
                        ((etx) obj13).ag.g((String) etdVar.a.c());
                        return;
                    }
                }
                ((etx) obj13).ag.i();
                return;
            default:
                jer jerVar10 = (jer) obj;
                if (!jerVar10.g()) {
                    return;
                }
                Object obj14 = this.a;
                ((etx) obj14).c.c((ag) obj14, (evh) jerVar10.c(), R.id.confirm_button, new eka(obj14, 7));
                return;
        }
    }
}
