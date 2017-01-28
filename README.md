PayPal Lift Module
==================

This module provides integration with PayPal IPN and PDT.

To include this module in your Lift project, update your `libraryDependencies` in `build.sbt` to include:

*Lift 2.6.x* for Scala 2.9 and 2.10:

    "net.liftmodules" %% "paypal_2.6" % "1.2"

*Lift 2.6.x* for Scala 2.11:

    "net.liftmodules" %% "paypal_2.6" % "1.3"


*Lift 2.5.x* for Scala 2.9 and 2.10:

    "net.liftmodules" %% "paypal_2.5" % "1.2"

*Lift 3.0.x* for Scala 2.10 and 2.11:

    "net.liftmodules" %% "paypal_3.0" % "1.3-SNAPSHOT"


Documentation
=============

* Manning [offer a free PDF](http://www.manning.com/free/excerpt_perrett_a.html) titled _Collecting payment through PayPal_ which you can access in exchange for your name and email address.

* Chapter 5 of [Lift in Action](http://www.manning.com/perrett/).

**Note:** The module package changed from `net.liftweb.paypal` to `net.liftmodules.paypal` in May 2012.  Please consider this when referencing documentation written before that date.

* Found a problem?  Have a suggestion?  Please discuss it on the [Lift mailing list](https://groups.google.com/group/liftweb) before raising a ticket.


Customization
=============


Alt text
--------

To customize the alt text of the buy now button, set up a [resources entry](https://www.assembla.com/spaces/liftweb/wiki/Localization) for the key _liftmodules.paypal.button-alt-text_. For example, create _webapp/\_resources.html_, with the following content:

    <?xml version="1.0"?>
    <resources>
      <res name="liftmodules.paypal.button-alt-text">Place order now</res>
    </resources>


Notes for module developers
===========================

* The [Jenkins build](https://liftmodules.ci.cloudbees.com/job/PayPal/) is triggered on a push to master.



