[![Build Status](https://travis-ci.org/liftmodules/paypal.svg?branch=master)](https://travis-ci.org/liftmodules/paypal)

PayPal Lift Module
==================

This module provides integration with PayPal IPN and PDT.

To include this module in your Lift project, update your `libraryDependencies` in `build.sbt` to include:


    "net.liftmodules" %% "paypal_<Lift Edition>" % "<Module Version>"

...replacing `<Lift Edition>` and `<Module Version>` with a value from the "Releases" table below.
E.g., for Lift 3.0 and version 1.3.0 of this module you'd have:


    libraryDependencies +=
      "net.liftmodules" %% "paypal_3.0" % "1.3.0"

Releases
========

| Lift Edition | Scala Version | Module Version |
|--------------|---------------|----------------|
| 3.0          | 2.12    | [![Maven Central](https://maven-badges.herokuapp.com/maven-central/net.liftmodules/paypal_3.0_2.12/badge.svg)](https://maven-badges.herokuapp.com/maven-central/net.liftmodules/paypal_3.0_2.12) |
| 3.0          | 2.11    | [![Maven Central](https://maven-badges.herokuapp.com/maven-central/net.liftmodules/paypal_3.0_2.11/badge.svg)](https://maven-badges.herokuapp.com/maven-central/net.liftmodules/paypal_3.0_2.11) |
| 2.6          | 2.11          | [![Maven Central](https://maven-badges.herokuapp.com/maven-central/net.liftmodules/paypal_2.6_2.11/badge.svg)](https://maven-badges.herokuapp.com/maven-central/net.liftmodules/paypal_2.6_2.11) |
| 2.6          | 2.10          | [![Maven Central](https://maven-badges.herokuapp.com/maven-central/net.liftmodules/paypal_2.6_2.10/badge.svg)](https://maven-badges.herokuapp.com/maven-central/net.liftmodules/paypal_2.6_2.10) |
| 2.6          | 2.10, 2.9     | 1.2            |
| 2.5          | 2.10, 2.9     | 1.2            |


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

Merge to master will trigger a Travis build and publish a SNAPSHOT (if the version is a -SNAPSHOT).


